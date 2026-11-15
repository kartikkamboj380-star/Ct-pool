.class public Lu0/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;


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
    sput-object v0, Lu0/w0;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lu0/w0;Lz3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lu0/w0;->l(Lz3/l;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Landroid/content/Intent;

    .line 4
    .line 5
    const-class v2, Lapp/notifee/core/NotificationAlarmReceiver;

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "notificationId"

    .line 11
    .line 12
    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/high16 v2, 0xa000000

    .line 20
    .line 21
    invoke-static {v0, p0, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string v0, "NotifeeAlarmManager"

    .line 28
    .line 29
    const-string v1, "Unable to create AlarmManager intent"

    .line 30
    .line 31
    invoke-static {v0, v1, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static c(Lz3/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lz3/l;->l()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LS5/r;

    .line 28
    .line 29
    iget-object v0, v0, LS5/r;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Lu0/w0;->b(Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, LS5/a;->a()Landroid/app/AlarmManager;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public static d()Lz3/c;
    .locals 1

    .line 1
    new-instance v0, Lu0/u0;

    .line 2
    .line 3
    invoke-direct {v0}, Lu0/u0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static e(Ljava/lang/String;Lz3/l;)Lz3/l;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LS5/r;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, LS5/r;->b:[B

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, LS5/r;->c:[B

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v0}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p1, LS5/r;->b:[B

    .line 23
    .line 24
    invoke-static {v1}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lapp/notifee/core/model/NotificationModel;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v0}, Lu0/R0;->x(Lapp/notifee/core/model/NotificationModel;Landroid/os/Bundle;)Lz3/l;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v3, Lu0/t0;

    .line 38
    .line 39
    invoke-direct {v3, v0, v2, p0, p1}, Lu0/t0;-><init>(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;Ljava/lang/String;LS5/r;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v3}, Lz3/l;->c(Lz3/f;)Lz3/l;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    :goto_0
    const-string p0, "NotifeeAlarmManager"

    .line 48
    .line 49
    const-string p1, "Attempted to handle doScheduledWork but no notification data was found."

    .line 50
    .line 51
    invoke-static {p0, p1}, Lapp/notifee/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static f(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string v0, "notificationId"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance v0, Lv0/i;

    .line 14
    .line 15
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lv0/i;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lu0/r0;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lu0/r0;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lv0/i;->q(Ljava/lang/String;)Lz3/l;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, Lu0/w0;->a:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Lz3/l;->j(Ljava/util/concurrent/Executor;Lz3/c;)Lz3/l;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance v0, Lu0/s0;

    .line 36
    .line 37
    invoke-direct {v0}, Lu0/s0;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lz3/l;->c(Lz3/f;)Lz3/l;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static g(Landroid/os/Bundle;Lapp/notifee/core/model/NotificationModel;Ljava/lang/String;LS5/r;Lz3/l;)V
    .locals 1

    .line 1
    invoke-virtual {p4}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p4}, Lz3/l;->k()Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "NotifeeAlarmManager"

    .line 12
    .line 13
    const-string p2, "Failed to display notification"

    .line 14
    .line 15
    invoke-static {p1, p2, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p4, "repeatFrequency"

    .line 20
    .line 21
    invoke-virtual {p0, p4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-static {p4}, LS5/m;->a(Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    const/4 v0, -0x1

    .line 36
    if-eq p4, v0, :cond_1

    .line 37
    .line 38
    new-instance p4, Lw0/d;

    .line 39
    .line 40
    invoke-direct {p4, p0}, Lw0/d;-><init>(Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Lw0/d;->a()V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p4}, Lu0/w0;->h(Lapp/notifee/core/model/NotificationModel;Lw0/d;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, LS5/e;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {p1}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p4, LS5/r;

    .line 56
    .line 57
    iget-object p3, p3, LS5/r;->b:[B

    .line 58
    .line 59
    invoke-static {p0}, LS5/m;->c(Landroid/os/Bundle;)[B

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-direct {p4, p2, p3, p0, v0}, LS5/r;-><init>(Ljava/lang/String;[B[BLjava/lang/Boolean;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p4}, Lv0/i;->y(LS5/r;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 73
    .line 74
    invoke-static {p0}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0, p2}, Lv0/i;->m(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    return-void
.end method

.method public static h(Lapp/notifee/core/model/NotificationModel;Lw0/d;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lu0/w0;->b(Ljava/lang/String;)Landroid/app/PendingIntent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, LS5/a;->a()Landroid/app/AlarmManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p1, Lw0/d;->e:Lw0/d$a;

    .line 14
    .line 15
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v4, 0x1f

    .line 18
    .line 19
    if-lt v3, v4, :cond_0

    .line 20
    .line 21
    sget-object v3, Lw0/d$a;->o:Lw0/d$a;

    .line 22
    .line 23
    sget-object v4, Lw0/d$a;->p:Lw0/d$a;

    .line 24
    .line 25
    sget-object v5, Lw0/d$a;->q:Lw0/d$a;

    .line 26
    .line 27
    filled-new-array {v3, v4, v5}, [Lw0/d$a;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-static {v1}, Lu0/f;->a(Landroid/app/AlarmManager;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 48
    .line 49
    const-string p1, "Missing SCHEDULE_EXACT_ALARM permission. Trigger not scheduled. See: https://notifee.app/react-native/docs/triggers#android-12-limitations"

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-virtual {p1}, Lw0/d;->a()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x1

    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    if-eq v2, v3, :cond_4

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    if-eq v2, v3, :cond_3

    .line 70
    .line 71
    const/4 v3, 0x3

    .line 72
    if-eq v2, v3, :cond_2

    .line 73
    .line 74
    const/4 v3, 0x4

    .line 75
    if-eq v2, v3, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    sget-object v2, LS5/e;->a:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {p0}, Lapp/notifee/core/model/NotificationModel;->c()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    const/high16 v4, 0xc000000

    .line 101
    .line 102
    invoke-static {v2, p0, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iget-object p1, p1, Lw0/d;->g:Ljava/lang/Long;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    invoke-static {v1, v2, v3, p0, v0}, Landroidx/core/app/e;->a(Landroid/app/AlarmManager;JLandroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    iget-object p0, p1, Lw0/d;->g:Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide p0

    .line 122
    invoke-static {v1, v4, p0, p1, v0}, Landroidx/core/app/e;->d(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    iget-object p0, p1, Lw0/d;->g:Ljava/lang/Long;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide p0

    .line 132
    invoke-static {v1, v4, p0, p1, v0}, Landroidx/core/app/e;->c(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    iget-object p0, p1, Lw0/d;->g:Ljava/lang/Long;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide p0

    .line 142
    invoke-static {v1, v4, p0, p1, v0}, Landroidx/core/app/e;->b(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    iget-object p0, p1, Lw0/d;->g:Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide p0

    .line 152
    invoke-virtual {v1, v3, p0, p1, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 153
    .line 154
    .line 155
    :goto_0
    return-void
.end method

.method public static i(Lz3/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object p0, LS5/e;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p0}, Lv0/i;->i(Landroid/content/Context;)Lv0/i;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lv0/i;->j(Ljava/lang/Boolean;)Lz3/l;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, Lu0/v0;

    .line 14
    .line 15
    invoke-direct {v0}, Lu0/v0;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lz3/l;->i(Lz3/c;)Lz3/l;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static synthetic k(Lz3/l;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz3/l;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lz3/l;->k()Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "NotifeeAlarmManager"

    .line 12
    .line 13
    const-string v1, "Failed to display notification"

    .line 14
    .line 15
    invoke-static {v0, v1, p0}, Lapp/notifee/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private l(Lz3/l;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lz3/l;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LS5/r;

    .line 22
    .line 23
    iget-object v1, v0, LS5/r;->b:[B

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, LS5/r;->c:[B

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v0}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v1}, LS5/m;->b([B)Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lapp/notifee/core/model/NotificationModel;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lapp/notifee/core/model/NotificationModel;-><init>(Landroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "type"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, LS5/m;->a(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v1, Lw0/d;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Lw0/d;-><init>(Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v1, Lw0/d;->d:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {v2, v1}, Lu0/w0;->h(Lapp/notifee/core/model/NotificationModel;Lw0/d;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    return-void
.end method


# virtual methods
.method public j()V
    .locals 2

    .line 1
    const-string v0, "NotifeeAlarmManager"

    .line 2
    .line 3
    const-string v1, "Reschedule Notifications on reboot"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lapp/notifee/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lv0/i;

    .line 9
    .line 10
    sget-object v1, LS5/e;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lv0/i;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lv0/i;->j(Ljava/lang/Boolean;)Lz3/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lu0/q0;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lu0/q0;-><init>(Lu0/w0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lz3/l;->c(Lz3/f;)Lz3/l;

    .line 27
    .line 28
    .line 29
    return-void
.end method
