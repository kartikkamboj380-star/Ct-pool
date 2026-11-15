package com.tenjin.android;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.tenjin.android.utils.TenjinUtils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class HttpConnection {
    private static final String TAG = "HttpConnection";

    HttpConnection() {
    }

    static String convertMapToString(Map<String, String> map, boolean z6) {
        StringBuilder sb;
        String value;
        String string = "";
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (string.length() > 0) {
                    string = string + "&";
                }
                if (z6) {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append(Uri.encode(entry.getKey()));
                    sb.append("=");
                    value = Uri.encode(entry.getValue());
                } else {
                    sb = new StringBuilder();
                    sb.append(string);
                    sb.append(entry.getKey());
                    sb.append("=");
                    value = entry.getValue();
                }
                sb.append(value);
                string = sb.toString();
            }
        }
        return string;
    }

    private HttpURLConnection getConnection(URL url) {
        return getConnection(url, "GET", null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean connect(String str, Map<String, String> map, Map<String, String> map2) throws Throwable {
        HttpURLConnection connection;
        Log.d(TAG, "--------------------");
        InputStream errorStream = null;
        try {
            connection = getConnection(new URL(str), "POST", map, map2);
        } catch (Exception e7) {
            e = e7;
            connection = null;
        } catch (Throwable th) {
            th = th;
            connection = null;
            if (errorStream != null) {
            }
            if (connection != null) {
            }
        }
        if (connection == null) {
            if (connection != null) {
                connection.disconnect();
            }
            return false;
        }
        try {
            try {
                int responseCode = connection.getResponseCode();
                errorStream = (200 > responseCode || responseCode > 299) ? connection.getErrorStream() : connection.getInputStream();
                if (errorStream == null) {
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    connection.disconnect();
                    return false;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line + "\n");
                }
                String string = sb.toString();
                try {
                    bufferedReader.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                Log.d(TAG, "Tenjin::connect params: " + map);
                Log.d(TAG, "Tenjin::connect response: " + string);
                z = responseCode == 200;
                try {
                    errorStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                if (errorStream != null) {
                    try {
                        errorStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                if (connection != null) {
                }
                Log.d(TAG, "--------------------");
                return z;
            }
            connection.disconnect();
            Log.d(TAG, "--------------------");
            return z;
        } catch (Throwable th2) {
            th = th2;
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            if (connection != null) {
                throw th;
            }
            connection.disconnect();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:28|(2:29|(1:31)(1:99))|32|92|33|37|(1:39)(7:41|(1:45)|96|47|51|74|75)|40|96|47|51|74|75) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        r12.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Pair<Boolean, Boolean> connectWithRetryCheck(String str, Map<String, String> map, Map<String, String> map2) throws Throwable {
        ?? r11;
        HttpURLConnection connection;
        int responseCode;
        InputStream errorStream;
        Pair<Boolean, Boolean> pair;
        Log.d(TAG, "--------------------");
        Boolean bool = Boolean.FALSE;
        Pair<Boolean, Boolean> pair2 = new Pair<>(bool, bool);
        InputStream inputStream = null;
        try {
            try {
                connection = getConnection(new URL(str), "POST", map, map2);
            } catch (Throwable th) {
                th = th;
                r11 = str;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                if (r11 != 0) {
                    throw th;
                }
                r11.disconnect();
                throw th;
            }
        } catch (UnknownHostException e8) {
            e = e8;
            connection = null;
        } catch (Exception e9) {
            e = e9;
            connection = null;
        } catch (Throwable th2) {
            th = th2;
            r11 = 0;
            if (0 != 0) {
            }
            if (r11 != 0) {
            }
        }
        if (connection == null) {
            if (connection != null) {
                connection.disconnect();
            }
            return pair2;
        }
        try {
            try {
                responseCode = connection.getResponseCode();
                errorStream = (200 > responseCode || responseCode > 299) ? connection.getErrorStream() : connection.getInputStream();
            } catch (UnknownHostException e10) {
                e = e10;
                e.printStackTrace();
                pair2 = new Pair<>(Boolean.FALSE, Boolean.TRUE);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                if (connection != null) {
                }
                Log.d(TAG, "--------------------");
                return pair2;
            }
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            if (connection != null) {
            }
            Log.d(TAG, "--------------------");
            return pair2;
        }
        if (errorStream == null) {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            connection.disconnect();
            return pair2;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line + "\n");
        }
        String string = sb.toString();
        try {
            bufferedReader.close();
        } catch (IOException e15) {
            e15.printStackTrace();
        }
        Log.d(TAG, "Tenjin::connect params: " + map);
        Log.d(TAG, "Tenjin::connect response: " + string);
        if (responseCode != 200) {
            if (connection.getHeaderFields().containsKey("no-retry") && !Boolean.parseBoolean(connection.getHeaderField("no-retry"))) {
                pair = new Pair<>(Boolean.FALSE, Boolean.TRUE);
            }
            errorStream.close();
            connection.disconnect();
            Log.d(TAG, "--------------------");
            return pair2;
        }
        pair = new Pair<>(Boolean.TRUE, Boolean.FALSE);
        pair2 = pair;
        errorStream.close();
        connection.disconnect();
        Log.d(TAG, "--------------------");
        return pair2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:80|26)|(4:27|(1:29)(1:83)|58|59)|34|68|35|39|71|40|44|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        r2.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r10.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String getUser(String str, Map<String, String> map) throws Throwable {
        ?? r9;
        HttpURLConnection httpURLConnection;
        String str2;
        String string;
        HttpURLConnection connection;
        InputStream errorStream;
        BufferedReader bufferedReader;
        StringBuilder sb;
        Log.d(TAG, "--------------------");
        InputStream inputStream = null;
        try {
            try {
                connection = getConnection(new URL(str + "?" + convertMapToString(map, true)));
            } catch (Throwable th) {
                th = th;
                r9 = str;
            }
        } catch (Exception e7) {
            e = e7;
            httpURLConnection = null;
            str2 = null;
        } catch (Throwable th2) {
            th = th2;
            r9 = 0;
        }
        if (connection == null) {
            if (connection != null) {
                connection.disconnect();
            }
            return null;
        }
        try {
            int responseCode = connection.getResponseCode();
            errorStream = (200 > responseCode || responseCode > 299) ? connection.getErrorStream() : connection.getInputStream();
        } catch (Exception e8) {
            e = e8;
            str2 = null;
            httpURLConnection = connection;
        }
        if (errorStream == null) {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            connection.disconnect();
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
            sb = new StringBuilder();
        } catch (Exception e10) {
            inputStream = errorStream;
            e = e10;
            str2 = null;
            httpURLConnection = connection;
            e.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            string = str2;
        } catch (Throwable th3) {
            inputStream = errorStream;
            th = th3;
            r9 = connection;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            if (r9 == 0) {
                throw th;
            }
            r9.disconnect();
            throw th;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line + "\n");
            Log.d(TAG, "--------------------");
            return string;
        }
        string = sb.toString();
        bufferedReader.close();
        Log.d(TAG, "Tenjin::getUser response: " + string);
        errorStream.close();
        connection.disconnect();
        Log.d(TAG, "--------------------");
        return string;
    }

    private HttpURLConnection getConnection(URL url, String str, Map<String, String> map, Map<String, String> map2) throws InterruptedException, IOException {
        HttpURLConnection httpURLConnection;
        int i7 = 0;
        while (true) {
            if (i7 > 1) {
                long delayForRetry = TenjinUtils.getDelayForRetry(i7) * 1000;
                Log.d(TAG, "Retry attempt " + i7 + ", sleeping for " + delayForRetry + " ms");
                Thread.sleep(delayForRetry);
            }
            httpURLConnection = (HttpURLConnection) url.openConnection();
            if (map2 != null && map2.size() > 0) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if (str.equals("POST")) {
                String strConvertMapToString = convertMapToString(map, false);
                byte[] bytes = strConvertMapToString.getBytes();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(0);
                httpURLConnection.setReadTimeout(0);
                httpURLConnection.setChunkedStreamingMode(0);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("charset", "utf-8");
                if (bytes.length > 0) {
                    httpURLConnection.setRequestProperty("Content-Length", Integer.toString(strConvertMapToString.getBytes().length));
                }
                httpURLConnection.setUseCaches(false);
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(strConvertMapToString.getBytes("UTF-8"));
                dataOutputStream.flush();
                dataOutputStream.close();
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 500 || responseCode > 599) {
                break;
            }
            httpURLConnection.disconnect();
            i7++;
            map.put("retry_attempts", Integer.toString(i7));
        }
        return httpURLConnection;
    }
}
