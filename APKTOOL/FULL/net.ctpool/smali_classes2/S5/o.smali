.class public abstract LS5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Ljava/util/Map;


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "-"

    .line 15
    .line 16
    const-string v1, "_"

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "_"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-class v1, LS5/o;

    .line 43
    .line 44
    monitor-enter v1

    .line 45
    :try_start_0
    invoke-static {}, LS5/o;->b()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-static {}, LS5/o;->b()Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    monitor-exit v1

    .line 70
    return p0

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, p0, p1, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-static {}, LS5/o;->b()Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    monitor-exit v1

    .line 99
    return p0

    .line 100
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0

    .line 102
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 103
    return p0
.end method

.method public static b()Ljava/util/Map;
    .locals 2

    .line 1
    sget-object v0, LS5/o;->a:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, LS5/o;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, LS5/o;->a:Ljava/util/Map;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, LS5/o;->a:Ljava/util/Map;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, LS5/o;->a:Ljava/util/Map;

    .line 27
    .line 28
    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lz3/l;
    .locals 6

    .line 1
    new-instance v0, Lz3/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lz3/m;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lz3/m;->a()Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "/"

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_4

    .line 17
    .line 18
    const-string v2, "mipmap"

    .line 19
    .line 20
    invoke-static {p0, v2}, LS5/o;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const-string v2, "drawable"

    .line 27
    .line 28
    invoke-static {p0, v2}, LS5/o;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :cond_0
    const/4 v3, 0x0

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    move-object v2, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    if-lez v2, :cond_2

    .line 38
    .line 39
    new-instance v4, Landroid/net/Uri$Builder;

    .line 40
    .line 41
    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v5, "res"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v4, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    if-nez v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Lz3/m;->c(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :try_start_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-nez v4, :cond_6

    .line 85
    .line 86
    invoke-static {v2}, LS5/o;->d(Ljava/lang/String;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_2

    .line 91
    :catch_0
    invoke-static {v2}, LS5/o;->d(Ljava/lang/String;)Landroid/net/Uri;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    :try_start_1
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    if-nez v3, :cond_5

    .line 105
    .line 106
    invoke-static {p0}, LS5/o;->d(Ljava/lang/String;)Landroid/net/Uri;

    .line 107
    .line 108
    .line 109
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    :cond_5
    move-object v3, v2

    .line 111
    goto :goto_2

    .line 112
    :catch_1
    invoke-static {p0}, LS5/o;->d(Ljava/lang/String;)Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    :cond_6
    :goto_2
    invoke-static {v3}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, LJ1/c;->a()LJ1/b;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {}, Lc1/c;->c()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_7

    .line 129
    .line 130
    const-string v3, "ResourceUtils"

    .line 131
    .line 132
    const-string v4, "Fresco initializing natively by Notifee"

    .line 133
    .line 134
    invoke-static {v3, v4}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    sget-object v3, LS5/e;->a:Landroid/content/Context;

    .line 138
    .line 139
    invoke-static {v3}, Lc1/c;->d(Landroid/content/Context;)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-static {}, Lc1/c;->a()Ly1/k;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    sget-object v4, LS5/e;->a:Landroid/content/Context;

    .line 147
    .line 148
    invoke-virtual {v3, v2, v4}, Ly1/k;->g(LJ1/b;Ljava/lang/Object;)LY0/c;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v3, LS5/o$a;

    .line 153
    .line 154
    invoke-direct {v3, v0, p0}, LS5/o$a;-><init>(Lz3/m;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, LM0/a;->a()LM0/a;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-interface {v2, v3, p0}, LY0/c;->e(LY0/e;Ljava/util/concurrent/Executor;)V

    .line 162
    .line 163
    .line 164
    return-object v1
.end method

.method public static d(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p0, v0}, LS5/o;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-lez p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/net/Uri$Builder;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "res"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 34
    .line 35
    :goto_0
    return-object p0
.end method

.method public static e(Ljava/lang/String;)Landroid/net/Uri;
    .locals 5

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    const-string v2, "://"

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    const-string v2, "default"

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x2

    .line 29
    invoke-static {p0}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v2, "raw"

    .line 35
    .line 36
    invoke-static {p0, v2}, LS5/o;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    const-string v4, "."

    .line 43
    .line 44
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    const/16 v3, 0x2e

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3, v2}, LS5/o;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    :cond_3
    if-nez v3, :cond_4

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v2, "android.resource://"

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, "/raw/"

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method
