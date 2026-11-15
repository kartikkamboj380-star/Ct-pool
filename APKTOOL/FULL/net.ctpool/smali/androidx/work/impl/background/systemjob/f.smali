.class Landroidx/work/impl/background/systemjob/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/ComponentName;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobInfoConverter"

    invoke-static {v0}, Ll0/i;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemjob/f;->b:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/ComponentName;

    const-class v1, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/f;->a:Landroid/content/ComponentName;

    return-void
.end method

.method private static b(Ll0/b$b;)Landroid/app/job/JobInfo$TriggerContentUri;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll0/b$b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 6
    .line 7
    invoke-virtual {p0}, Ll0/b$b;->a()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v1, p0, v0}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 12
    .line 13
    .line 14
    return-object v1
.end method

.method static c(Ll0/j;)I
    .locals 5

    .line 1
    sget-object v0, Landroidx/work/impl/background/systemjob/f$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_5

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq v0, v2, :cond_4

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    if-eq v0, v3, :cond_3

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    const/4 v3, 0x5

    .line 22
    if-eq v0, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v3, 0x1a

    .line 28
    .line 29
    if-lt v0, v3, :cond_1

    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    :goto_0
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v2, Landroidx/work/impl/background/systemjob/f;->b:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v4, "API version too low. Cannot convert network type value "

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, v2, p0}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return v1

    .line 59
    :cond_2
    return v3

    .line 60
    :cond_3
    return v2

    .line 61
    :cond_4
    return v1

    .line 62
    :cond_5
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method static d(Landroid/app/job/JobInfo$Builder;Ll0/j;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Ll0/j;->r:Ll0/j;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroid/net/NetworkRequest$Builder;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x19

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p0, p1}, Landroidx/work/impl/background/systemjob/e;->a(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)Landroid/app/job/JobInfo$Builder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/f;->c(Ll0/j;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
.end method


# virtual methods
.method a(Lq0/u;I)Landroid/app/job/JobInfo;
    .locals 10

    .line 1
    iget-object v0, p1, Lq0/u;->j:Ll0/b;

    .line 2
    .line 3
    new-instance v1, Landroid/os/PersistableBundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "EXTRA_WORK_SPEC_ID"

    .line 9
    .line 10
    iget-object v3, p1, Lq0/u;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    invoke-virtual {p1}, Lq0/u;->f()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    const-string v2, "EXTRA_IS_PERIODIC"

    .line 25
    .line 26
    invoke-virtual {p1}, Lq0/u;->j()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Landroid/app/job/JobInfo$Builder;

    .line 34
    .line 35
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/f;->a:Landroid/content/ComponentName;

    .line 36
    .line 37
    invoke-direct {v2, p2, v3}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ll0/b;->g()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-virtual {v2, p2}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {v0}, Ll0/b;->h()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p2, v2}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2, v1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v0}, Ll0/b;->d()Ll0/j;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {p2, v1}, Landroidx/work/impl/background/systemjob/f;->d(Landroid/app/job/JobInfo$Builder;Ll0/j;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ll0/b;->h()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x0

    .line 72
    const/4 v3, 0x1

    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    iget-object v1, p1, Lq0/u;->l:Ll0/a;

    .line 76
    .line 77
    sget-object v4, Ll0/a;->n:Ll0/a;

    .line 78
    .line 79
    if-ne v1, v4, :cond_0

    .line 80
    .line 81
    move v1, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v1, v3

    .line 84
    :goto_0
    iget-wide v4, p1, Lq0/u;->m:J

    .line 85
    .line 86
    invoke-virtual {p2, v4, v5, v1}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 87
    .line 88
    .line 89
    :cond_1
    invoke-virtual {p1}, Lq0/u;->c()J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    sub-long/2addr v4, v6

    .line 98
    const-wide/16 v6, 0x0

    .line 99
    .line 100
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 105
    .line 106
    const/16 v8, 0x1c

    .line 107
    .line 108
    if-gt v1, v8, :cond_2

    .line 109
    .line 110
    :goto_1
    invoke-virtual {p2, v4, v5}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    cmp-long v1, v4, v6

    .line 115
    .line 116
    if-lez v1, :cond_3

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    iget-boolean v1, p1, Lq0/u;->q:Z

    .line 120
    .line 121
    if-nez v1, :cond_4

    .line 122
    .line 123
    invoke-static {p2, v3}, Landroidx/work/impl/background/systemjob/a;->a(Landroid/app/job/JobInfo$Builder;Z)Landroid/app/job/JobInfo$Builder;

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_2
    invoke-virtual {v0}, Ll0/b;->e()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    invoke-virtual {v0}, Ll0/b;->c()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_5

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    check-cast v8, Ll0/b$b;

    .line 151
    .line 152
    invoke-static {v8}, Landroidx/work/impl/background/systemjob/f;->b(Ll0/b$b;)Landroid/app/job/JobInfo$TriggerContentUri;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    invoke-virtual {p2, v8}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    invoke-virtual {v0}, Ll0/b;->b()J

    .line 161
    .line 162
    .line 163
    move-result-wide v8

    .line 164
    invoke-virtual {p2, v8, v9}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ll0/b;->a()J

    .line 168
    .line 169
    .line 170
    move-result-wide v8

    .line 171
    invoke-virtual {p2, v8, v9}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 172
    .line 173
    .line 174
    :cond_6
    invoke-virtual {p2, v2}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 175
    .line 176
    .line 177
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 178
    .line 179
    const/16 v8, 0x1a

    .line 180
    .line 181
    if-lt v1, v8, :cond_7

    .line 182
    .line 183
    invoke-virtual {v0}, Ll0/b;->f()Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    invoke-static {p2, v8}, Landroidx/work/impl/background/systemjob/b;->a(Landroid/app/job/JobInfo$Builder;Z)Landroid/app/job/JobInfo$Builder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ll0/b;->i()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-static {p2, v0}, Landroidx/work/impl/background/systemjob/c;->a(Landroid/app/job/JobInfo$Builder;Z)Landroid/app/job/JobInfo$Builder;

    .line 195
    .line 196
    .line 197
    :cond_7
    iget v0, p1, Lq0/u;->k:I

    .line 198
    .line 199
    if-lez v0, :cond_8

    .line 200
    .line 201
    move v0, v3

    .line 202
    goto :goto_4

    .line 203
    :cond_8
    move v0, v2

    .line 204
    :goto_4
    cmp-long v4, v4, v6

    .line 205
    .line 206
    if-lez v4, :cond_9

    .line 207
    .line 208
    move v2, v3

    .line 209
    :cond_9
    const/16 v4, 0x1f

    .line 210
    .line 211
    if-lt v1, v4, :cond_a

    .line 212
    .line 213
    iget-boolean p1, p1, Lq0/u;->q:Z

    .line 214
    .line 215
    if-eqz p1, :cond_a

    .line 216
    .line 217
    if-nez v0, :cond_a

    .line 218
    .line 219
    if-nez v2, :cond_a

    .line 220
    .line 221
    invoke-static {p2, v3}, Landroidx/work/impl/background/systemjob/d;->a(Landroid/app/job/JobInfo$Builder;Z)Landroid/app/job/JobInfo$Builder;

    .line 222
    .line 223
    .line 224
    :cond_a
    invoke-virtual {p2}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    return-object p1
.end method
