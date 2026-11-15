.class public abstract Lz0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field protected b:Landroid/content/Intent;

.field protected c:Ljava/lang/String;

.field protected d:Ly0/e;

.field protected e:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Share"

    .line 5
    .line 6
    iput-object v0, p0, Lz0/n;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    new-instance p1, Landroid/content/Intent;

    .line 11
    .line 12
    const-string v0, "android.intent.action.SEND"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lz0/n;->n(Landroid/content/Intent;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "text/plain"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private c(Lcom/facebook/react/bridge/ReadableArray;)[Landroid/content/ComponentName;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 6
    .line 7
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move v2, v3

    .line 46
    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-ge v2, v4, :cond_3

    .line 51
    .line 52
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 71
    .line 72
    iget-object v7, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 73
    .line 74
    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_1

    .line 81
    .line 82
    new-instance v7, Landroid/content/ComponentName;

    .line 83
    .line 84
    iget-object v6, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 85
    .line 86
    iget-object v8, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {v7, v8, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    new-array p1, v3, [Landroid/content/ComponentName;

    .line 101
    .line 102
    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, [Landroid/content/ComponentName;

    .line 107
    .line 108
    return-object p1
.end method

.method public static j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    return p0
.end method

.method public static k(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    :try_start_0
    invoke-virtual {p1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return v0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method protected static o(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, "URLEncoder.encode() failed for "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected abstract b()Ljava/lang/String;
.end method

.method protected d(Lcom/facebook/react/bridge/ReadableMap;)Ly0/e;
    .locals 8

    .line 1
    const-string v0, "filename"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    move-object v4, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    const-string v1, "useInternalStorage"

    .line 20
    .line 21
    invoke-static {v1, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    move-object v5, v0

    .line 36
    const-string v0, "type"

    .line 37
    .line 38
    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const-string v2, "url"

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    new-instance v7, Ly0/e;

    .line 47
    .line 48
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v6, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 57
    .line 58
    move-object v1, v7

    .line 59
    invoke-direct/range {v1 .. v6}, Ly0/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 60
    .line 61
    .line 62
    return-object v7

    .line 63
    :cond_2
    new-instance v0, Ly0/e;

    .line 64
    .line 65
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v1, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 70
    .line 71
    invoke-direct {v0, p1, v4, v5, v1}, Ly0/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method protected e(Lcom/facebook/react/bridge/ReadableMap;)Ly0/f;
    .locals 7

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "filenames"

    .line 7
    .line 8
    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v1, v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    const-string v1, "useInternalStorage"

    .line 38
    .line 39
    invoke-static {v1, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_1
    move-object v4, v0

    .line 54
    const-string v0, "type"

    .line 55
    .line 56
    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const-string v3, "urls"

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    new-instance v6, Ly0/f;

    .line 65
    .line 66
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v5, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 75
    .line 76
    move-object v0, v6

    .line 77
    invoke-direct/range {v0 .. v5}, Ly0/f;-><init>(Lcom/facebook/react/bridge/ReadableArray;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 78
    .line 79
    .line 80
    return-object v6

    .line 81
    :cond_2
    new-instance v0, Ly0/f;

    .line 82
    .line 83
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object v1, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 88
    .line 89
    invoke-direct {v0, p1, v2, v4, v1}, Ly0/f;-><init>(Lcom/facebook/react/bridge/ReadableArray;Ljava/util/ArrayList;Ljava/lang/Boolean;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method protected f()Landroid/content/Intent;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/n;->b:Landroid/content/Intent;

    .line 2
    .line 3
    return-object v0
.end method

.method protected g(Landroid/content/Intent;Landroid/net/Uri;)[Landroid/content/Intent;
    .locals 7

    .line 1
    iget-object v0, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    new-array v2, v2, [Landroid/content/Intent;

    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ge v1, v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 29
    .line 30
    iget-object v4, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 31
    .line 32
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v5, Landroid/content/Intent;

    .line 35
    .line 36
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v6, Landroid/content/ComponentName;

    .line 40
    .line 41
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 42
    .line 43
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v6, v4, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    const-string v3, "android.intent.action.VIEW"

    .line 52
    .line 53
    invoke-virtual {v5, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v5, p2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    invoke-virtual {v5, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    new-instance v3, Landroid/content/Intent;

    .line 68
    .line 69
    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 70
    .line 71
    .line 72
    aput-object v3, v2, v1

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    return-object v2
.end method

.method protected abstract h()Ljava/lang/String;
.end method

.method protected abstract i()Ljava/lang/String;
.end method

.method public l(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 10

    .line 1
    iput-object p1, p0, Lz0/n;->e:Lcom/facebook/react/bridge/ReadableMap;

    const-string v0, "isNewTask"

    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v0

    const v1, 0x10008000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    const-string v0, "subject"

    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "android.intent.extra.SUBJECT"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    const-string v0, "email"

    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v2, "android.intent.extra.EMAIL"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    const-string v0, "title"

    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lz0/n;->c:Ljava/lang/String;

    :cond_3
    const-string v0, "message"

    invoke-static {v0, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_4

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v0, v2

    :goto_0
    const-string v1, "social"

    invoke-static {v1, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_5
    const-string v1, "sms"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "recipient"

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "address"

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_6
    const-string v1, "whatsapp"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "jid"

    const-string v4, "@s.whatsapp.net"

    const-string v5, "whatsAppNumber"

    if-eqz v1, :cond_7

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_7
    const-string v1, "whatsappbusiness"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_8
    const-string v1, "urls"

    invoke-static {v1, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v2

    const-string v3, " "

    const-string v4, "android.intent.extra.STREAM"

    const/4 v5, 0x1

    const-string v6, "android.intent.extra.TEXT"

    if-eqz v2, :cond_c

    invoke-virtual {p0, p1}, Lz0/n;->e(Lcom/facebook/react/bridge/ReadableMap;)Ly0/f;

    move-result-object v2

    invoke-virtual {v2}, Ly0/f;->f()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_a

    invoke-virtual {v2}, Ly0/f;->d()Ljava/util/ArrayList;

    move-result-object p1

    new-instance v1, Landroid/content/ClipData;

    new-instance v3, Landroid/content/ClipDescription;

    invoke-virtual {v2}, Ly0/f;->c()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    const-string v9, "Files"

    invoke-direct {v3, v9, v7}, Landroid/content/ClipDescription;-><init>(Ljava/lang/CharSequence;[Ljava/lang/String;)V

    new-instance v7, Landroid/content/ClipData$Item;

    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/Uri;

    invoke-direct {v7, v8}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-direct {v1, v3, v7}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    move v3, v5

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v3, v7, :cond_9

    new-instance v7, Landroid/content/ClipData$Item;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/net/Uri;

    invoke-direct {v7, v8}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v1, v7}, Landroid/content/ClipData;->addItem(Landroid/content/ClipData$Item;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v1

    const-string v3, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v2}, Ly0/f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, v4, p1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_4

    :cond_a
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p1

    invoke-interface {p1, v8}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_2

    :cond_b
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p1

    invoke-interface {p1, v8}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    :cond_c
    const-string v1, "url"

    invoke-static {v1, p1}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, p1}, Lz0/n;->d(Lcom/facebook/react/bridge/ReadableMap;)Ly0/e;

    move-result-object v2

    iput-object v2, p0, Lz0/n;->d:Ly0/e;

    invoke-virtual {v2}, Ly0/e;->f()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object p1, p0, Lz0/n;->d:Ly0/e;

    invoke-virtual {p1}, Ly0/e;->d()Landroid/net/Uri;

    move-result-object p1

    iget-object v1, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "File"

    invoke-static {v1, v2, p1}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    move-result-object v1

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v2

    iget-object v3, p0, Lz0/n;->d:Ly0/e;

    invoke-virtual {v3}, Ly0/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_4

    :cond_d
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_5

    :cond_e
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_3
    invoke-virtual {v0, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_5

    :cond_f
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_10

    :goto_4
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_10
    :goto_5
    return-void
.end method

.method protected m()V
    .locals 6

    .line 1
    iget-object v0, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Something went wrong"

    .line 10
    .line 11
    invoke-static {v0}, Lz0/q;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Lz0/q;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lz0/n;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 22
    .line 23
    invoke-static {v1}, Lz0/q;->c(Lcom/facebook/react/bridge/ReactContext;)Landroid/content/IntentSender;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, p0, Lz0/n;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v3, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lz0/n;->f()Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, p0, Lz0/n;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const/4 v1, 0x0

    .line 49
    :goto_0
    const/high16 v3, 0x40000000    # 2.0f

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    const-string v3, "showAppsToView"

    .line 55
    .line 56
    iget-object v4, p0, Lz0/n;->e:Lcom/facebook/react/bridge/ReadableMap;

    .line 57
    .line 58
    invoke-static {v3, v4}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    const-string v3, "url"

    .line 65
    .line 66
    iget-object v4, p0, Lz0/n;->e:Lcom/facebook/react/bridge/ReadableMap;

    .line 67
    .line 68
    invoke-static {v3, v4}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    new-instance v3, Landroid/content/Intent;

    .line 75
    .line 76
    const-string v4, "android.intent.action.VIEW"

    .line 77
    .line 78
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v4, p0, Lz0/n;->d:Ly0/e;

    .line 82
    .line 83
    invoke-virtual {v4}, Ly0/e;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    iget-object v4, p0, Lz0/n;->d:Ly0/e;

    .line 91
    .line 92
    invoke-virtual {v4}, Ly0/e;->d()Landroid/net/Uri;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {p0, v3, v4}, Lz0/n;->g(Landroid/content/Intent;Landroid/net/Uri;)[Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const-string v4, "android.intent.extra.INITIAL_INTENTS"

    .line 101
    .line 102
    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object v3, p0, Lz0/n;->e:Lcom/facebook/react/bridge/ReadableMap;

    .line 106
    .line 107
    const-string v4, "excludedActivityTypes"

    .line 108
    .line 109
    invoke-static {v4, v3}, Lz0/n;->j(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    const/16 v5, 0x41cd

    .line 114
    .line 115
    if-eqz v3, :cond_3

    .line 116
    .line 117
    iget-object v3, p0, Lz0/n;->e:Lcom/facebook/react/bridge/ReadableMap;

    .line 118
    .line 119
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-direct {p0, v3}, Lz0/n;->c(Lcom/facebook/react/bridge/ReadableArray;)[Landroid/content/ComponentName;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const-string v4, "android.intent.extra.EXCLUDE_COMPONENTS"

    .line 128
    .line 129
    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {v0, v2, v5}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 133
    .line 134
    .line 135
    if-nez v1, :cond_4

    .line 136
    .line 137
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "success"

    .line 142
    .line 143
    const/4 v2, 0x1

    .line 144
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    const-string v1, "message"

    .line 148
    .line 149
    const-string v2, "OK"

    .line 150
    .line 151
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, Lz0/q;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_4
    return-void
.end method

.method protected n(Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz0/n;->b:Landroid/content/Intent;

    .line 2
    .line 3
    return-void
.end method
