.class final Lcom/google/android/gms/common/api/internal/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/f;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

.field private final b:I

.field private final c:Lcom/google/android/gms/common/api/internal/ApiKey;

.field private final d:J

.field private final e:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/GoogleApiManager;ILcom/google/android/gms/common/api/internal/ApiKey;JJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/H;->a:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/H;->b:I

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/H;->c:Lcom/google/android/gms/common/api/internal/ApiKey;

    iput-wide p4, p0, Lcom/google/android/gms/common/api/internal/H;->d:J

    iput-wide p6, p0, Lcom/google/android/gms/common/api/internal/H;->e:J

    return-void
.end method

.method static b(Lcom/google/android/gms/common/api/internal/GoogleApiManager;ILcom/google/android/gms/common/api/internal/ApiKey;)Lcom/google/android/gms/common/api/internal/H;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->zaD()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->getInstance()Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->getConfig()Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getMethodInvocationTelemetryEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getMethodTimingTelemetryEnabled()Z

    move-result v0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->zai(Lcom/google/android/gms/common/api/internal/ApiKey;)Lcom/google/android/gms/common/api/internal/zabq;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zabq;->zaf()Lcom/google/android/gms/common/api/Api$Client;

    move-result-object v2

    instance-of v2, v2, Lcom/google/android/gms/common/internal/BaseGmsClient;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zabq;->zaf()Lcom/google/android/gms/common/api/Api$Client;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/internal/BaseGmsClient;

    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/BaseGmsClient;->hasConnectionInfo()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/BaseGmsClient;->isConnecting()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/common/api/internal/H;->c(Lcom/google/android/gms/common/api/internal/zabq;Lcom/google/android/gms/common/internal/BaseGmsClient;I)Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zabq;->zaq()V

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMethodTimingTelemetryEnabled()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    const/4 v0, 0x1

    :cond_3
    :goto_1
    new-instance v11, Lcom/google/android/gms/common/api/internal/H;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    move-wide v5, v3

    goto :goto_2

    :cond_4
    move-wide v5, v1

    :goto_2
    if-eqz v0, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    move-wide v7, v0

    goto :goto_3

    :cond_5
    move-wide v7, v1

    :goto_3
    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v11

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/common/api/internal/H;-><init>(Lcom/google/android/gms/common/api/internal/GoogleApiManager;ILcom/google/android/gms/common/api/internal/ApiKey;JJLjava/lang/String;Ljava/lang/String;)V

    return-object v11
.end method

.method private static c(Lcom/google/android/gms/common/api/internal/zabq;Lcom/google/android/gms/common/internal/BaseGmsClient;I)Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getTelemetryConfiguration()Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMethodInvocationTelemetryEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMethodInvocationMethodKeyAllowlist()[I

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMethodInvocationMethodKeyDisallowlist()[I

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1, p2}, Lcom/google/android/gms/common/util/ArrayUtils;->contains([II)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_1
    invoke-static {v1, p2}, Lcom/google/android/gms/common/util/ArrayUtils;->contains([II)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/zabq;->zac()I

    move-result p0

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMaxMethodInvocationsLogged()I

    move-result p2

    if-ge p0, p2, :cond_3

    return-object p1

    :cond_3
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final a(Lz3/l;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/H;->a:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->zaD()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->getInstance()Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/RootTelemetryConfigManager;->getConfig()Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getMethodInvocationTelemetryEnabled()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_b

    .line 28
    .line 29
    :cond_1
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/H;->a:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 30
    .line 31
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/H;->c:Lcom/google/android/gms/common/api/internal/ApiKey;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->zai(Lcom/google/android/gms/common/api/internal/ApiKey;)Lcom/google/android/gms/common/api/internal/zabq;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_b

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/zabq;->zaf()Lcom/google/android/gms/common/api/Api$Client;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    instance-of v3, v3, Lcom/google/android/gms/common/internal/BaseGmsClient;

    .line 44
    .line 45
    if-eqz v3, :cond_b

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/zabq;->zaf()Lcom/google/android/gms/common/api/Api$Client;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/google/android/gms/common/internal/BaseGmsClient;

    .line 52
    .line 53
    iget-wide v4, v0, Lcom/google/android/gms/common/api/internal/H;->d:J

    .line 54
    .line 55
    const-wide/16 v6, 0x0

    .line 56
    .line 57
    cmp-long v4, v4, v6

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    const/4 v8, 0x0

    .line 61
    if-lez v4, :cond_2

    .line 62
    .line 63
    move v4, v5

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v4, v8

    .line 66
    :goto_0
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getGCoreServiceId()I

    .line 67
    .line 68
    .line 69
    move-result v19

    .line 70
    const/16 v9, 0x64

    .line 71
    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getMethodTimingTelemetryEnabled()Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    and-int/2addr v4, v10

    .line 79
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getBatchPeriodMillis()I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getMaxMethodInvocationsInBatch()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->getVersion()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/BaseGmsClient;->hasConnectionInfo()Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-eqz v12, :cond_4

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/BaseGmsClient;->isConnecting()Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-nez v12, :cond_4

    .line 102
    .line 103
    iget v4, v0, Lcom/google/android/gms/common/api/internal/H;->b:I

    .line 104
    .line 105
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/api/internal/H;->c(Lcom/google/android/gms/common/api/internal/zabq;Lcom/google/android/gms/common/internal/BaseGmsClient;I)Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-eqz v2, :cond_b

    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMethodTimingTelemetryEnabled()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    iget-wide v3, v0, Lcom/google/android/gms/common/api/internal/H;->d:J

    .line 118
    .line 119
    cmp-long v3, v3, v6

    .line 120
    .line 121
    if-lez v3, :cond_3

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    move v5, v8

    .line 125
    :goto_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->getMaxMethodInvocationsLogged()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    move v4, v5

    .line 130
    :cond_4
    move v2, v10

    .line 131
    move v3, v11

    .line 132
    goto :goto_2

    .line 133
    :cond_5
    const/16 v10, 0x1388

    .line 134
    .line 135
    move v1, v8

    .line 136
    move v3, v9

    .line 137
    move v2, v10

    .line 138
    :goto_2
    iget-object v5, v0, Lcom/google/android/gms/common/api/internal/H;->a:Lcom/google/android/gms/common/api/internal/GoogleApiManager;

    .line 139
    .line 140
    invoke-virtual/range {p1 .. p1}, Lz3/l;->p()Z

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    const/4 v11, -0x1

    .line 145
    if-eqz v10, :cond_6

    .line 146
    .line 147
    move v12, v8

    .line 148
    goto :goto_5

    .line 149
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lz3/l;->n()Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-eqz v8, :cond_7

    .line 154
    .line 155
    :goto_3
    move v8, v9

    .line 156
    :goto_4
    move v12, v11

    .line 157
    goto :goto_5

    .line 158
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lz3/l;->k()Ljava/lang/Exception;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    instance-of v9, v8, Lcom/google/android/gms/common/api/ApiException;

    .line 163
    .line 164
    if-eqz v9, :cond_9

    .line 165
    .line 166
    check-cast v8, Lcom/google/android/gms/common/api/ApiException;

    .line 167
    .line 168
    invoke-virtual {v8}, Lcom/google/android/gms/common/api/ApiException;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    invoke-virtual {v8}, Lcom/google/android/gms/common/api/Status;->getConnectionResult()Lcom/google/android/gms/common/ConnectionResult;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    if-nez v8, :cond_8

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_8
    invoke-virtual {v8}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    move v12, v8

    .line 188
    move v8, v9

    .line 189
    goto :goto_5

    .line 190
    :cond_9
    const/16 v8, 0x65

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :goto_5
    if-eqz v4, :cond_a

    .line 194
    .line 195
    iget-wide v6, v0, Lcom/google/android/gms/common/api/internal/H;->d:J

    .line 196
    .line 197
    iget-wide v9, v0, Lcom/google/android/gms/common/api/internal/H;->e:J

    .line 198
    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 200
    .line 201
    .line 202
    move-result-wide v13

    .line 203
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 204
    .line 205
    .line 206
    move-result-wide v15

    .line 207
    sub-long v9, v15, v9

    .line 208
    .line 209
    long-to-int v4, v9

    .line 210
    move/from16 v20, v4

    .line 211
    .line 212
    move-wide v15, v13

    .line 213
    move-wide v13, v6

    .line 214
    goto :goto_6

    .line 215
    :cond_a
    move-wide v13, v6

    .line 216
    move-wide v15, v13

    .line 217
    move/from16 v20, v11

    .line 218
    .line 219
    :goto_6
    iget v10, v0, Lcom/google/android/gms/common/api/internal/H;->b:I

    .line 220
    .line 221
    new-instance v4, Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    move-object v9, v4

    .line 228
    move v11, v8

    .line 229
    invoke-direct/range {v9 .. v20}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 230
    .line 231
    .line 232
    int-to-long v14, v2

    .line 233
    move-object v11, v5

    .line 234
    move-object v12, v4

    .line 235
    move v13, v1

    .line 236
    move/from16 v16, v3

    .line 237
    .line 238
    invoke-virtual/range {v11 .. v16}, Lcom/google/android/gms/common/api/internal/GoogleApiManager;->zaw(Lcom/google/android/gms/common/internal/MethodInvocation;IJI)V

    .line 239
    .line 240
    .line 241
    :cond_b
    :goto_7
    return-void
.end method
