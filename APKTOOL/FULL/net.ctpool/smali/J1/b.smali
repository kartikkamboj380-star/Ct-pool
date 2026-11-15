.class public LJ1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ1/b$c;,
        LJ1/b$b;
    }
.end annotation


# static fields
.field private static x:Z

.field private static y:Z

.field public static final z:LO0/e;


# instance fields
.field private a:I

.field private final b:LJ1/b$b;

.field private final c:Landroid/net/Uri;

.field private final d:I

.field private e:Ljava/io/File;

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private final i:Lx1/c;

.field private final j:Lx1/f;

.field private final k:Lx1/g;

.field private final l:Lx1/a;

.field private final m:Lx1/e;

.field private final n:LJ1/b$c;

.field protected o:I

.field private final p:Z

.field private final q:Z

.field private final r:Ljava/lang/Boolean;

.field private final s:LJ1/d;

.field private final t:LF1/e;

.field private final u:Ljava/lang/Boolean;

.field private final v:Ljava/lang/String;

.field private final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ1/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LJ1/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ1/b;->z:LO0/e;

    .line 7
    .line 8
    return-void
.end method

.method protected constructor <init>(LJ1/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LJ1/c;->d()LJ1/b$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LJ1/b;->b:LJ1/b$b;

    .line 9
    .line 10
    invoke-virtual {p1}, LJ1/c;->q()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LJ1/b;->c:Landroid/net/Uri;

    .line 15
    .line 16
    invoke-static {v0}, LJ1/b;->w(Landroid/net/Uri;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, LJ1/b;->d:I

    .line 21
    .line 22
    invoke-virtual {p1}, LJ1/c;->v()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput-boolean v0, p0, LJ1/b;->f:Z

    .line 27
    .line 28
    invoke-virtual {p1}, LJ1/c;->t()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput-boolean v0, p0, LJ1/b;->g:Z

    .line 33
    .line 34
    invoke-virtual {p1}, LJ1/c;->i()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput-boolean v0, p0, LJ1/b;->h:Z

    .line 39
    .line 40
    invoke-virtual {p1}, LJ1/c;->h()Lx1/c;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, LJ1/b;->i:Lx1/c;

    .line 45
    .line 46
    invoke-virtual {p1}, LJ1/c;->n()Lx1/f;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, LJ1/b;->j:Lx1/f;

    .line 51
    .line 52
    invoke-virtual {p1}, LJ1/c;->p()Lx1/g;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    invoke-static {}, Lx1/g;->c()Lx1/g;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p1}, LJ1/c;->p()Lx1/g;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_0
    iput-object v0, p0, LJ1/b;->k:Lx1/g;

    .line 68
    .line 69
    invoke-virtual {p1}, LJ1/c;->c()Lx1/a;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, LJ1/b;->l:Lx1/a;

    .line 74
    .line 75
    invoke-virtual {p1}, LJ1/c;->m()Lx1/e;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, LJ1/b;->m:Lx1/e;

    .line 80
    .line 81
    invoke-virtual {p1}, LJ1/c;->j()LJ1/b$c;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, LJ1/b;->n:LJ1/b$c;

    .line 86
    .line 87
    invoke-virtual {p1}, LJ1/c;->s()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput-boolean v0, p0, LJ1/b;->p:Z

    .line 92
    .line 93
    invoke-virtual {p1}, LJ1/c;->e()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v0, :cond_1

    .line 98
    .line 99
    or-int/lit8 v1, v1, 0x30

    .line 100
    .line 101
    :cond_1
    iput v1, p0, LJ1/b;->o:I

    .line 102
    .line 103
    invoke-virtual {p1}, LJ1/c;->u()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iput-boolean v0, p0, LJ1/b;->q:Z

    .line 108
    .line 109
    invoke-virtual {p1}, LJ1/c;->P()Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, LJ1/b;->r:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p1}, LJ1/c;->k()LJ1/d;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, LJ1/b;->s:LJ1/d;

    .line 120
    .line 121
    invoke-virtual {p1}, LJ1/c;->l()LF1/e;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, LJ1/b;->t:LF1/e;

    .line 126
    .line 127
    invoke-virtual {p1}, LJ1/c;->o()Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, p0, LJ1/b;->u:Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p1}, LJ1/c;->f()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iput v0, p0, LJ1/b;->w:I

    .line 138
    .line 139
    invoke-virtual {p1}, LJ1/c;->g()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, p0, LJ1/b;->v:Ljava/lang/String;

    .line 144
    .line 145
    return-void
.end method

.method public static a(Landroid/net/Uri;)LJ1/b;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p0}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, LJ1/c;->a()LJ1/b;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    return-object p0
.end method

.method private static w(Landroid/net/Uri;)I
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p0}, LW0/f;->n(Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-static {p0}, LW0/f;->l(Landroid/net/Uri;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, LQ0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, LQ0/a;->c(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    return p0

    .line 41
    :cond_2
    const/4 p0, 0x3

    .line 42
    return p0

    .line 43
    :cond_3
    invoke-static {p0}, LW0/f;->k(Landroid/net/Uri;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const/4 p0, 0x4

    .line 50
    return p0

    .line 51
    :cond_4
    invoke-static {p0}, LW0/f;->h(Landroid/net/Uri;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    const/4 p0, 0x5

    .line 58
    return p0

    .line 59
    :cond_5
    invoke-static {p0}, LW0/f;->m(Landroid/net/Uri;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    const/4 p0, 0x6

    .line 66
    return p0

    .line 67
    :cond_6
    invoke-static {p0}, LW0/f;->g(Landroid/net/Uri;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    const/4 p0, 0x7

    .line 74
    return p0

    .line 75
    :cond_7
    invoke-static {p0}, LW0/f;->o(Landroid/net/Uri;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_8

    .line 80
    .line 81
    const/16 p0, 0x8

    .line 82
    .line 83
    return p0

    .line 84
    :cond_8
    return v0
.end method


# virtual methods
.method public b()Lx1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->l:Lx1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LJ1/b$b;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->b:LJ1/b$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LJ1/b;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LJ1/b;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, LJ1/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, LJ1/b;

    .line 8
    .line 9
    sget-boolean v0, LJ1/b;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, LJ1/b;->a:I

    .line 14
    .line 15
    iget v2, p1, LJ1/b;->a:I

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget-boolean v0, p0, LJ1/b;->g:Z

    .line 25
    .line 26
    iget-boolean v2, p1, LJ1/b;->g:Z

    .line 27
    .line 28
    if-eq v0, v2, :cond_2

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    iget-boolean v0, p0, LJ1/b;->p:Z

    .line 32
    .line 33
    iget-boolean v2, p1, LJ1/b;->p:Z

    .line 34
    .line 35
    if-eq v0, v2, :cond_3

    .line 36
    .line 37
    return v1

    .line 38
    :cond_3
    iget-boolean v0, p0, LJ1/b;->q:Z

    .line 39
    .line 40
    iget-boolean v2, p1, LJ1/b;->q:Z

    .line 41
    .line 42
    if-eq v0, v2, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    iget-object v0, p0, LJ1/b;->c:Landroid/net/Uri;

    .line 46
    .line 47
    iget-object v2, p1, LJ1/b;->c:Landroid/net/Uri;

    .line 48
    .line 49
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_9

    .line 54
    .line 55
    iget-object v0, p0, LJ1/b;->b:LJ1/b$b;

    .line 56
    .line 57
    iget-object v2, p1, LJ1/b;->b:LJ1/b$b;

    .line 58
    .line 59
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_9

    .line 64
    .line 65
    iget-object v0, p0, LJ1/b;->v:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, p1, LJ1/b;->v:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_9

    .line 74
    .line 75
    iget-object v0, p0, LJ1/b;->e:Ljava/io/File;

    .line 76
    .line 77
    iget-object v2, p1, LJ1/b;->e:Ljava/io/File;

    .line 78
    .line 79
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_9

    .line 84
    .line 85
    iget-object v0, p0, LJ1/b;->l:Lx1/a;

    .line 86
    .line 87
    iget-object v2, p1, LJ1/b;->l:Lx1/a;

    .line 88
    .line 89
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    iget-object v0, p0, LJ1/b;->i:Lx1/c;

    .line 96
    .line 97
    iget-object v2, p1, LJ1/b;->i:Lx1/c;

    .line 98
    .line 99
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    iget-object v0, p0, LJ1/b;->j:Lx1/f;

    .line 106
    .line 107
    iget-object v2, p1, LJ1/b;->j:Lx1/f;

    .line 108
    .line 109
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_9

    .line 114
    .line 115
    iget-object v0, p0, LJ1/b;->m:Lx1/e;

    .line 116
    .line 117
    iget-object v2, p1, LJ1/b;->m:Lx1/e;

    .line 118
    .line 119
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    iget-object v0, p0, LJ1/b;->n:LJ1/b$c;

    .line 126
    .line 127
    iget-object v2, p1, LJ1/b;->n:LJ1/b$c;

    .line 128
    .line 129
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    iget v0, p0, LJ1/b;->o:I

    .line 136
    .line 137
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget v2, p1, LJ1/b;->o:I

    .line 142
    .line 143
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_9

    .line 152
    .line 153
    iget-object v0, p0, LJ1/b;->r:Ljava/lang/Boolean;

    .line 154
    .line 155
    iget-object v2, p1, LJ1/b;->r:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    iget-object v0, p0, LJ1/b;->u:Ljava/lang/Boolean;

    .line 164
    .line 165
    iget-object v2, p1, LJ1/b;->u:Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    iget-object v0, p0, LJ1/b;->k:Lx1/g;

    .line 174
    .line 175
    iget-object v2, p1, LJ1/b;->k:Lx1/g;

    .line 176
    .line 177
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_9

    .line 182
    .line 183
    iget-boolean v0, p0, LJ1/b;->h:Z

    .line 184
    .line 185
    iget-boolean v2, p1, LJ1/b;->h:Z

    .line 186
    .line 187
    if-eq v0, v2, :cond_5

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    iget-object v0, p0, LJ1/b;->s:LJ1/d;

    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    invoke-interface {v0}, LJ1/d;->b()LI0/d;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    goto :goto_0

    .line 200
    :cond_6
    move-object v0, v2

    .line 201
    :goto_0
    iget-object v3, p1, LJ1/b;->s:LJ1/d;

    .line 202
    .line 203
    if-eqz v3, :cond_7

    .line 204
    .line 205
    invoke-interface {v3}, LJ1/d;->b()LI0/d;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    :cond_7
    invoke-static {v0, v2}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-nez v0, :cond_8

    .line 214
    .line 215
    return v1

    .line 216
    :cond_8
    iget v0, p0, LJ1/b;->w:I

    .line 217
    .line 218
    iget p1, p1, LJ1/b;->w:I

    .line 219
    .line 220
    if-ne v0, p1, :cond_9

    .line 221
    .line 222
    const/4 v1, 0x1

    .line 223
    :cond_9
    :goto_1
    return v1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lx1/c;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->i:Lx1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, LJ1/b;->h:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-boolean v1, LJ1/b;->y:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget v3, v0, LJ1/b;->a:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v2

    .line 12
    :goto_0
    if-nez v3, :cond_3

    .line 13
    .line 14
    iget-object v3, v0, LJ1/b;->s:LJ1/d;

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-interface {v3}, LJ1/d;->b()LI0/d;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v3, 0x0

    .line 24
    :goto_1
    invoke-static {}, LP1/a;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    iget-object v4, v0, LJ1/b;->b:LJ1/b$b;

    .line 31
    .line 32
    iget-object v5, v0, LJ1/b;->v:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v6, v0, LJ1/b;->c:Landroid/net/Uri;

    .line 35
    .line 36
    iget-boolean v2, v0, LJ1/b;->g:Z

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget-object v8, v0, LJ1/b;->l:Lx1/a;

    .line 43
    .line 44
    iget-object v9, v0, LJ1/b;->m:Lx1/e;

    .line 45
    .line 46
    iget-object v10, v0, LJ1/b;->n:LJ1/b$c;

    .line 47
    .line 48
    iget v2, v0, LJ1/b;->o:I

    .line 49
    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    iget-boolean v2, v0, LJ1/b;->p:Z

    .line 55
    .line 56
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    iget-boolean v2, v0, LJ1/b;->q:Z

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    iget-object v14, v0, LJ1/b;->i:Lx1/c;

    .line 67
    .line 68
    iget-object v15, v0, LJ1/b;->r:Ljava/lang/Boolean;

    .line 69
    .line 70
    iget-object v2, v0, LJ1/b;->j:Lx1/f;

    .line 71
    .line 72
    move-object/from16 v16, v2

    .line 73
    .line 74
    iget-object v2, v0, LJ1/b;->k:Lx1/g;

    .line 75
    .line 76
    move-object/from16 v17, v2

    .line 77
    .line 78
    iget-object v2, v0, LJ1/b;->u:Ljava/lang/Boolean;

    .line 79
    .line 80
    move-object/from16 v19, v2

    .line 81
    .line 82
    iget v2, v0, LJ1/b;->w:I

    .line 83
    .line 84
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v20

    .line 88
    iget-boolean v2, v0, LJ1/b;->h:Z

    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v21

    .line 94
    move-object/from16 v18, v3

    .line 95
    .line 96
    filled-new-array/range {v4 .. v21}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v2}, LO0/j;->b([Ljava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    :goto_2
    move v3, v2

    .line 105
    goto/16 :goto_3

    .line 106
    .line 107
    :cond_2
    iget-object v4, v0, LJ1/b;->b:LJ1/b$b;

    .line 108
    .line 109
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    iget-object v4, v0, LJ1/b;->c:Landroid/net/Uri;

    .line 114
    .line 115
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    iget-boolean v4, v0, LJ1/b;->g:Z

    .line 120
    .line 121
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iget-object v4, v0, LJ1/b;->l:Lx1/a;

    .line 130
    .line 131
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    iget-object v4, v0, LJ1/b;->m:Lx1/e;

    .line 136
    .line 137
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    iget-object v4, v0, LJ1/b;->n:LJ1/b$c;

    .line 142
    .line 143
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    iget v4, v0, LJ1/b;->o:I

    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    iget-boolean v4, v0, LJ1/b;->p:Z

    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    iget-boolean v4, v0, LJ1/b;->q:Z

    .line 168
    .line 169
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    iget-object v4, v0, LJ1/b;->i:Lx1/c;

    .line 178
    .line 179
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    iget-object v4, v0, LJ1/b;->r:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    iget-object v4, v0, LJ1/b;->j:Lx1/f;

    .line 190
    .line 191
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    iget-object v4, v0, LJ1/b;->k:Lx1/g;

    .line 196
    .line 197
    invoke-static {v2, v4}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    invoke-static {v2, v3}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    iget-object v3, v0, LJ1/b;->u:Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-static {v2, v3}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    iget v3, v0, LJ1/b;->w:I

    .line 212
    .line 213
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-static {v2, v3}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    iget-boolean v3, v0, LJ1/b;->h:Z

    .line 222
    .line 223
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-static {v2, v3}, LQ1/a;->a(ILjava/lang/Object;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    goto :goto_2

    .line 232
    :goto_3
    if-eqz v1, :cond_3

    .line 233
    .line 234
    iput v3, v0, LJ1/b;->a:I

    .line 235
    .line 236
    :cond_3
    return v3
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/b;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public j()LJ1/b$c;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->n:LJ1/b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LJ1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->s:LJ1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->j:Lx1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lx1/f;->b:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x800

    .line 9
    .line 10
    :goto_0
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->j:Lx1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lx1/f;->a:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v0, 0x800

    .line 9
    .line 10
    :goto_0
    return v0
.end method

.method public n()Lx1/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->m:Lx1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/b;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public p()LF1/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->t:LF1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()Lx1/f;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->j:Lx1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->u:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Lx1/g;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->k:Lx1/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public declared-synchronized t()Ljava/io/File;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LJ1/b;->e:Ljava/io/File;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LJ1/b;->c:Landroid/net/Uri;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/io/File;

    .line 16
    .line 17
    iget-object v1, p0, LJ1/b;->c:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LJ1/b;->e:Ljava/io/File;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    iget-object v0, p0, LJ1/b;->e:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-object v0

    .line 35
    :goto_1
    monitor-exit p0

    .line 36
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, LO0/j;->c(Ljava/lang/Object;)LO0/j$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "uri"

    .line 6
    .line 7
    iget-object v2, p0, LJ1/b;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "cacheChoice"

    .line 14
    .line 15
    iget-object v2, p0, LJ1/b;->b:LJ1/b$b;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "decodeOptions"

    .line 22
    .line 23
    iget-object v2, p0, LJ1/b;->i:Lx1/c;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "postprocessor"

    .line 30
    .line 31
    iget-object v2, p0, LJ1/b;->s:LJ1/d;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "priority"

    .line 38
    .line 39
    iget-object v2, p0, LJ1/b;->m:Lx1/e;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "resizeOptions"

    .line 46
    .line 47
    iget-object v2, p0, LJ1/b;->j:Lx1/f;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v1, "rotationOptions"

    .line 54
    .line 55
    iget-object v2, p0, LJ1/b;->k:Lx1/g;

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "bytesRange"

    .line 62
    .line 63
    iget-object v2, p0, LJ1/b;->l:Lx1/a;

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "resizingAllowedOverride"

    .line 70
    .line 71
    iget-object v2, p0, LJ1/b;->u:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "progressiveRenderingEnabled"

    .line 78
    .line 79
    iget-boolean v2, p0, LJ1/b;->f:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, LO0/j$a;->c(Ljava/lang/String;Z)LO0/j$a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "localThumbnailPreviewsEnabled"

    .line 86
    .line 87
    iget-boolean v2, p0, LJ1/b;->g:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, LO0/j$a;->c(Ljava/lang/String;Z)LO0/j$a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "loadThumbnailOnly"

    .line 94
    .line 95
    iget-boolean v2, p0, LJ1/b;->h:Z

    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, LO0/j$a;->c(Ljava/lang/String;Z)LO0/j$a;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v1, "lowestPermittedRequestLevel"

    .line 102
    .line 103
    iget-object v2, p0, LJ1/b;->n:LJ1/b$c;

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "cachesDisabled"

    .line 110
    .line 111
    iget v2, p0, LJ1/b;->o:I

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, LO0/j$a;->a(Ljava/lang/String;I)LO0/j$a;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const-string v1, "isDiskCacheEnabled"

    .line 118
    .line 119
    iget-boolean v2, p0, LJ1/b;->p:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1, v2}, LO0/j$a;->c(Ljava/lang/String;Z)LO0/j$a;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v1, "isMemoryCacheEnabled"

    .line 126
    .line 127
    iget-boolean v2, p0, LJ1/b;->q:Z

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, LO0/j$a;->c(Ljava/lang/String;Z)LO0/j$a;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v1, "decodePrefetches"

    .line 134
    .line 135
    iget-object v2, p0, LJ1/b;->r:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v0, v1, v2}, LO0/j$a;->b(Ljava/lang/String;Ljava/lang/Object;)LO0/j$a;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "delayMs"

    .line 142
    .line 143
    iget v2, p0, LJ1/b;->w:I

    .line 144
    .line 145
    invoke-virtual {v0, v1, v2}, LO0/j$a;->a(Ljava/lang/String;I)LO0/j$a;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, LO0/j$a;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0
.end method

.method public u()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->c:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public v()I
    .locals 1

    .line 1
    iget v0, p0, LJ1/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public x(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ1/b;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr p1, v0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    return p1
.end method

.method public y()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/b;->r:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method
