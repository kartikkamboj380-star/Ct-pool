.class public abstract Lu0/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method public static a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    goto/16 :goto_6

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-static {p0}, Lu0/L;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lu0/Q;->a(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "name"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lu0/S;->a(Landroid/app/NotificationChannel;)Z

    move-result v2

    const-string v3, "badge"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0}, Lu0/T;->a(Landroid/app/NotificationChannel;)Z

    move-result v2

    const-string v3, "bypassDnd"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0}, Lu0/V;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {p0}, Lu0/V;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "description"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {p0}, Lu0/W;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {p0}, Lu0/W;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "groupId"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {p0}, Lu0/y;->a(Landroid/app/NotificationChannel;)I

    move-result v2

    const-string v3, "importance"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {p0}, Lu0/X;->a(Landroid/app/NotificationChannel;)Z

    move-result v2

    const-string v3, "lights"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0}, Lu0/M;->a(Landroid/app/NotificationChannel;)Z

    move-result v2

    const-string v3, "vibration"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0}, Lu0/y;->a(Landroid/app/NotificationChannel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_3

    move v2, v4

    goto :goto_0

    :cond_3
    move v2, v3

    :goto_0
    const-string v5, "blocked"

    invoke-virtual {v1, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0}, Lu0/A;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {p0}, Lu0/A;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "soundURI"

    invoke-virtual {v1, v5, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lu0/A;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "android.resource"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const-string v6, "ResourceUtils"

    const-string v7, "Loaded sound by resource id. New app builds will fail to play sound. Create a new channel to resolve. Issue #341"

    invoke-static {v6, v7}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v5, :cond_6

    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    sget-object v7, LS5/e;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v5, v6, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v4, v6, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-nez v4, :cond_5

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_6

    :cond_5
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "res/raw/"

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v0, v2

    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    const-string v2, "sound"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    invoke-static {p0}, Lu0/N;->a(Landroid/app/NotificationChannel;)I

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {p0}, Lu0/N;->a(Landroid/app/NotificationChannel;)I

    move-result v0

    sget-object v2, LS5/d;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "#"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    const-string v0, "lightColor"

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    invoke-static {p0}, Lu0/O;->a(Landroid/app/NotificationChannel;)[J

    move-result-object v0

    if-eqz v0, :cond_b

    array-length v2, v0

    if-lez v2, :cond_b

    :try_start_1
    array-length v2, v0

    new-array v2, v2, [I

    :goto_3
    array-length v4, v0

    if-ge v3, v4, :cond_a

    aget-wide v4, v0, v3

    long-to-int v4, v4

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_a
    const-string v0, "vibrationPattern"

    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :goto_4
    const-string v2, "ChannelManager"

    const-string v3, "Unable to convert Vibration Pattern to Channel Bundle"

    invoke-static {v2, v3, v0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_b
    :goto_5
    invoke-static {p0}, Lu0/P;->a(Landroid/app/NotificationChannel;)I

    move-result p0

    const/16 v0, -0x3e8

    if-eq p0, v0, :cond_c

    const-string v0, "visibility"

    invoke-virtual {v1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_c
    return-object v1

    :cond_d
    :goto_6
    return-object v0
.end method

.method public static b(Landroid/app/NotificationChannelGroup;)Landroid/os/Bundle;
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x1a

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Landroidx/core/app/M;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "id"

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lu0/Z;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "name"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Lu0/a0;->a(Landroid/app/NotificationChannelGroup;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lu0/b0;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Lu0/p0;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const-string v1, "channels"

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 82
    .line 83
    const/16 v2, 0x1c

    .line 84
    .line 85
    const-string v3, "blocked"

    .line 86
    .line 87
    if-lt v1, v2, :cond_2

    .line 88
    .line 89
    invoke-static {p0}, Lu0/c0;->a(Landroid/app/NotificationChannelGroup;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Lu0/d0;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string v1, "description"

    .line 101
    .line 102
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const/4 p0, 0x0

    .line 107
    invoke-virtual {v0, v3, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 108
    .line 109
    .line 110
    :goto_1
    return-object v0

    .line 111
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method

.method public static c()Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/l0;

    .line 4
    .line 5
    invoke-direct {v1}, Lu0/l0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public static d(LS5/b;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/f0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/f0;-><init>(LS5/b;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static e(LS5/c;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/j0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/j0;-><init>(LS5/c;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/g0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/g0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static g(Ljava/util/List;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/m0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/m0;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static h(LS5/b;)Ljava/lang/Void;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-static {}, Lu0/I;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LS5/b;->a:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v3, "id"

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, LS5/b;->a:Landroid/os/Bundle;

    .line 24
    .line 25
    const-string v4, "name"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v3}, Lu0/x;->a(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/app/NotificationChannelGroup;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/16 v3, 0x1c

    .line 39
    .line 40
    if-lt v0, v3, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, LS5/b;->a:Landroid/os/Bundle;

    .line 43
    .line 44
    const-string v3, "description"

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget-object p0, p0, LS5/b;->a:Landroid/os/Bundle;

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v1, p0}, Lu0/e0;->a(Landroid/app/NotificationChannelGroup;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 62
    .line 63
    invoke-static {p0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, v1}, Landroidx/core/app/T;->f(Landroid/app/NotificationChannelGroup;)V

    .line 68
    .line 69
    .line 70
    return-object v2
.end method

.method public static i(LS5/c;)Ljava/lang/Void;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {}, Lu0/Y;->a()V

    iget-object v0, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v1, "id"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "name"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v4, "importance"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, LS5/c;->a:Landroid/os/Bundle;

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LS5/m;->a(Ljava/lang/Object;)I

    move-result v3

    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x3

    goto :goto_0

    :goto_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v0, v1, v3}, Lu0/U;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v0

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "badge"

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lu0/z;->a(Landroid/app/NotificationChannel;Z)V

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "bypassDnd"

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lu0/C;->a(Landroid/app/NotificationChannel;Z)V

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "description"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lu0/D;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "groupId"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lu0/E;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "lights"

    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lu0/F;->a(Landroid/app/NotificationChannel;Z)V

    invoke-virtual {p0}, LS5/c;->a()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LS5/c;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lu0/G;->a(Landroid/app/NotificationChannel;I)V

    :cond_2
    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "visibility"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LS5/m;->a(Ljava/lang/Object;)I

    move-result v1

    goto :goto_2

    :cond_3
    move v1, v5

    :goto_2
    invoke-static {v0, v1}, Lu0/H;->a(Landroid/app/NotificationChannel;I)V

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "vibration"

    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lu0/J;->a(Landroid/app/NotificationChannel;Z)V

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "vibrationPattern"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    new-array v1, v5, [J

    goto :goto_4

    :cond_4
    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [J

    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v5, v4, :cond_5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->longValue()J

    move-result-wide v6

    aput-wide v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    move-object v1, v3

    :goto_4
    array-length v3, v1

    if-lez v3, :cond_6

    invoke-static {v0, v1}, Lu0/K;->a(Landroid/app/NotificationChannel;[J)V

    :cond_6
    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    const-string v3, "sound"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    move-object v1, v2

    goto :goto_5

    :cond_7
    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_5
    if-eqz v1, :cond_a

    iget-object v1, p0, LS5/c;->a:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    move-object p0, v2

    goto :goto_6

    :cond_8
    iget-object p0, p0, LS5/c;->a:Landroid/os/Bundle;

    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_6
    invoke-static {p0}, LS5/o;->e(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_9

    new-instance v1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v3, 0x5

    invoke-virtual {v1, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lu0/B;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    goto :goto_7

    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to retrieve sound for channel, sound was specified as: "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lu0/A;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ChannelManager"

    invoke-static {v1, p0}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    invoke-static {v0, v2, v2}, Lu0/B;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    :goto_7
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    invoke-static {p0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/core/app/T;->e(Landroid/app/NotificationChannel;)V

    return-object v2
.end method

.method public static j()Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/h0;

    .line 4
    .line 5
    invoke-direct {v1}, Lu0/h0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public static k(Ljava/lang/String;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/o0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/o0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static l(Ljava/util/List;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/i0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/i0;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static synthetic m(Ljava/util/List;)Ljava/lang/Void;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LS5/b;

    .line 24
    .line 25
    invoke-static {v0}, Lu0/p0;->d(LS5/b;)Lz3/l;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lz3/o;->a(Lz3/l;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v2
.end method

.method public static n()Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/core/app/T;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v2, 0x1a

    .line 20
    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Landroidx/core/app/L;->a(Ljava/lang/Object;)Landroid/app/NotificationChannelGroup;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lu0/p0;->b(Landroid/app/NotificationChannelGroup;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v1

    .line 60
    :cond_2
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

.method public static o(Ljava/lang/String;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/n0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/n0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static synthetic p(Ljava/util/List;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LS5/c;

    .line 16
    .line 17
    invoke-static {v0}, Lu0/p0;->e(LS5/c;)Lz3/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lz3/o;->a(Lz3/l;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static q()Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/core/app/T;->n()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v2, 0x1a

    .line 20
    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lu0/b0;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lu0/p0;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v1

    .line 60
    :cond_2
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

.method public static r(Ljava/lang/String;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lu0/p0;->a:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lu0/k0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lu0/k0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static s(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroidx/core/app/T;->k(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lu0/p0;->a(Landroid/app/NotificationChannel;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static t(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 1
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroidx/core/app/T;->l(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lu0/p0;->b(Landroid/app/NotificationChannelGroup;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static u(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Landroidx/core/app/T;->k(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p0}, Lu0/y;->a(Landroid/app/NotificationChannel;)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static v(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/core/app/T;->i(Landroid/content/Context;)Landroidx/core/app/T;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Landroidx/core/app/T;->k(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
