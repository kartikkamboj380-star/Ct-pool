.class public abstract Lc1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Class;

.field private static b:Lc1/f; = null

.field private static volatile c:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lc1/c;

    .line 2
    .line 3
    sput-object v0, Lc1/c;->a:Ljava/lang/Class;

    .line 4
    .line 5
    return-void
.end method

.method public static a()Ly1/k;
    .locals 1

    .line 1
    invoke-static {}, Lc1/c;->b()Ly1/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ly1/o;->l()Ly1/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static b()Ly1/o;
    .locals 1

    .line 1
    invoke-static {}, Ly1/o;->n()Ly1/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lc1/c;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, v0}, Lc1/c;->f(Landroid/content/Context;Ly1/l;Lc1/b;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static e(Landroid/content/Context;Ly1/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lc1/c;->f(Landroid/content/Context;Ly1/l;Lc1/b;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static f(Landroid/content/Context;Ly1/l;Lc1/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lc1/c;->g(Landroid/content/Context;Ly1/l;Lc1/b;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static g(Landroid/content/Context;Ly1/l;Lc1/b;Z)V
    .locals 2

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Fresco#initialize"

    .line 8
    .line 9
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-boolean v0, Lc1/c;->c:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lc1/c;->a:Ljava/lang/Class;

    .line 17
    .line 18
    const-string v1, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"

    .line 19
    .line 20
    invoke-static {v0, v1}, LP0/a;->C(Ljava/lang/Class;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    sput-boolean v0, Lc1/c;->c:Z

    .line 26
    .line 27
    :goto_0
    invoke-static {p3}, Ly1/p;->b(Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, LN2/a;->c()Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-nez p3, :cond_4

    .line 35
    .line 36
    invoke-static {}, LK1/b;->d()Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_2

    .line 41
    .line 42
    const-string p3, "Fresco.initialize->SoLoader.init"

    .line 43
    .line 44
    invoke-static {p3}, LK1/b;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :try_start_0
    const-string p3, "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"

    .line 48
    .line 49
    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    const-string v0, "init"

    .line 54
    .line 55
    const-class v1, Landroid/content/Context;

    .line 56
    .line 57
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {p3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    invoke-static {}, LK1/b;->d()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_4

    .line 78
    .line 79
    :goto_1
    invoke-static {}, LK1/b;->b()V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    goto :goto_2

    .line 85
    :catch_0
    :try_start_1
    new-instance p3, LN2/c;

    .line 86
    .line 87
    invoke-direct {p3}, LN2/c;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-static {p3}, LN2/a;->b(LN2/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    invoke-static {}, LK1/b;->d()Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-eqz p3, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catch_1
    :try_start_2
    new-instance p3, LN2/c;

    .line 101
    .line 102
    invoke-direct {p3}, LN2/c;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-static {p3}, LN2/a;->b(LN2/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .line 107
    .line 108
    invoke-static {}, LK1/b;->d()Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-eqz p3, :cond_4

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catch_2
    :try_start_3
    new-instance p3, LN2/c;

    .line 116
    .line 117
    invoke-direct {p3}, LN2/c;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {p3}, LN2/a;->b(LN2/b;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    .line 122
    .line 123
    invoke-static {}, LK1/b;->d()Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-eqz p3, :cond_4

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catch_3
    :try_start_4
    new-instance p3, LN2/c;

    .line 131
    .line 132
    invoke-direct {p3}, LN2/c;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-static {p3}, LN2/a;->b(LN2/b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    .line 137
    .line 138
    invoke-static {}, LK1/b;->d()Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    if-eqz p3, :cond_4

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :goto_2
    invoke-static {}, LK1/b;->d()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_3

    .line 150
    .line 151
    invoke-static {}, LK1/b;->b()V

    .line 152
    .line 153
    .line 154
    :cond_3
    throw p0

    .line 155
    :cond_4
    :goto_3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    if-nez p1, :cond_5

    .line 160
    .line 161
    invoke-static {p0}, Ly1/o;->w(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_5
    invoke-static {p1}, Ly1/o;->x(Ly1/m;)V

    .line 166
    .line 167
    .line 168
    :goto_4
    invoke-static {p0, p2}, Lc1/c;->h(Landroid/content/Context;Lc1/b;)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, LK1/b;->d()Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-eqz p0, :cond_6

    .line 176
    .line 177
    invoke-static {}, LK1/b;->b()V

    .line 178
    .line 179
    .line 180
    :cond_6
    return-void
.end method

.method private static h(Landroid/content/Context;Lc1/b;)V
    .locals 1

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Fresco.initializeDrawee"

    .line 8
    .line 9
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lc1/f;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lc1/f;-><init>(Landroid/content/Context;Lc1/b;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lc1/c;->b:Lc1/f;

    .line 18
    .line 19
    invoke-static {v0}, Ln1/e;->g(LO0/o;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, LK1/b;->d()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {}, LK1/b;->b()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public static i()Lc1/e;
    .locals 1

    .line 1
    sget-object v0, Lc1/c;->b:Lc1/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc1/f;->a()Lc1/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
