.class public LJ1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ1/c$a;
    }
.end annotation


# static fields
.field private static final s:Ljava/util/Set;


# instance fields
.field private a:Landroid/net/Uri;

.field private b:LJ1/b$c;

.field private c:I

.field private d:Lx1/f;

.field private e:Lx1/g;

.field private f:Lx1/c;

.field private g:LJ1/b$b;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lx1/e;

.field private l:LJ1/d;

.field private m:Ljava/lang/Boolean;

.field private n:LF1/e;

.field private o:Lx1/a;

.field private p:Ljava/lang/Boolean;

.field private q:I

.field private r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ1/c;->s:Ljava/util/Set;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 6
    .line 7
    sget-object v1, LJ1/b$c;->n:LJ1/b$c;

    .line 8
    .line 9
    iput-object v1, p0, LJ1/c;->b:LJ1/b$c;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, LJ1/c;->c:I

    .line 13
    .line 14
    iput-object v0, p0, LJ1/c;->d:Lx1/f;

    .line 15
    .line 16
    iput-object v0, p0, LJ1/c;->e:Lx1/g;

    .line 17
    .line 18
    invoke-static {}, Lx1/c;->a()Lx1/c;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, p0, LJ1/c;->f:Lx1/c;

    .line 23
    .line 24
    sget-object v2, LJ1/b$b;->n:LJ1/b$b;

    .line 25
    .line 26
    iput-object v2, p0, LJ1/c;->g:LJ1/b$b;

    .line 27
    .line 28
    invoke-static {}, Ly1/l;->K()Ly1/l$c;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ly1/l$c;->a()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput-boolean v2, p0, LJ1/c;->h:Z

    .line 37
    .line 38
    iput-boolean v1, p0, LJ1/c;->i:Z

    .line 39
    .line 40
    iput-boolean v1, p0, LJ1/c;->j:Z

    .line 41
    .line 42
    sget-object v1, Lx1/e;->p:Lx1/e;

    .line 43
    .line 44
    iput-object v1, p0, LJ1/c;->k:Lx1/e;

    .line 45
    .line 46
    iput-object v0, p0, LJ1/c;->l:LJ1/d;

    .line 47
    .line 48
    iput-object v0, p0, LJ1/c;->m:Ljava/lang/Boolean;

    .line 49
    .line 50
    iput-object v0, p0, LJ1/c;->o:Lx1/a;

    .line 51
    .line 52
    iput-object v0, p0, LJ1/c;->p:Ljava/lang/Boolean;

    .line 53
    .line 54
    iput-object v0, p0, LJ1/c;->r:Ljava/lang/String;

    .line 55
    .line 56
    return-void
.end method

.method private A(I)LJ1/c;
    .locals 1

    .line 1
    iput p1, p0, LJ1/c;->c:I

    .line 2
    .line 3
    iget-object p1, p0, LJ1/c;->g:LJ1/b$b;

    .line 4
    .line 5
    sget-object v0, LJ1/b$b;->o:LJ1/b$b;

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, LJ1/c;->r:Ljava/lang/String;

    .line 11
    .line 12
    :cond_0
    return-object p0
.end method

.method public static b(LJ1/b;)LJ1/c;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ1/b;->u()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LJ1/b;->g()Lx1/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LJ1/c;->D(Lx1/c;)LJ1/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, LJ1/b;->b()Lx1/a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, LJ1/c;->y(Lx1/a;)LJ1/c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, LJ1/b;->c()LJ1/b$b;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, LJ1/c;->z(LJ1/b$b;)LJ1/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, LJ1/b;->i()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, LJ1/c;->F(Z)LJ1/c;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, LJ1/b;->h()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, LJ1/c;->E(Z)LJ1/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0}, LJ1/b;->j()LJ1/b$c;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, LJ1/c;->G(LJ1/b$c;)LJ1/c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, LJ1/b;->d()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-direct {v0, v1}, LJ1/c;->A(I)LJ1/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0}, LJ1/b;->k()LJ1/d;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, LJ1/c;->H(LJ1/d;)LJ1/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0}, LJ1/b;->o()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v0, v1}, LJ1/c;->I(Z)LJ1/c;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p0}, LJ1/b;->n()Lx1/e;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, LJ1/c;->K(Lx1/e;)LJ1/c;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0}, LJ1/b;->q()Lx1/f;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, LJ1/c;->L(Lx1/f;)LJ1/c;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p0}, LJ1/b;->p()LF1/e;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, LJ1/c;->J(LF1/e;)LJ1/c;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0}, LJ1/b;->s()Lx1/g;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, LJ1/c;->M(Lx1/g;)LJ1/c;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p0}, LJ1/b;->y()Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, LJ1/c;->N(Ljava/lang/Boolean;)LJ1/c;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p0}, LJ1/b;->e()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {v0, v1}, LJ1/c;->B(I)LJ1/c;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0}, LJ1/b;->f()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v0, p0}, LJ1/c;->C(Ljava/lang/String;)LJ1/c;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method

.method public static r(Landroid/net/Uri;)Z
    .locals 4

    .line 1
    sget-object v0, LJ1/c;->s:Ljava/util/Set;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_0
    return v1
.end method

.method public static w(Landroid/net/Uri;)LJ1/c;
    .locals 1

    .line 1
    new-instance v0, LJ1/c;

    .line 2
    .line 3
    invoke-direct {v0}, LJ1/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LJ1/c;->O(Landroid/net/Uri;)LJ1/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public B(I)LJ1/c;
    .locals 0

    .line 1
    iput p1, p0, LJ1/c;->q:I

    .line 2
    .line 3
    return-object p0
.end method

.method public C(Ljava/lang/String;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public D(Lx1/c;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->f:Lx1/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public E(Z)LJ1/c;
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ1/c;->j:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public F(Z)LJ1/c;
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ1/c;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public G(LJ1/b$c;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->b:LJ1/b$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public H(LJ1/d;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->l:LJ1/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public I(Z)LJ1/c;
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ1/c;->h:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public J(LF1/e;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->n:LF1/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public K(Lx1/e;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->k:Lx1/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public L(Lx1/f;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->d:Lx1/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public M(Lx1/g;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->e:Lx1/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public N(Ljava/lang/Boolean;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public O(Landroid/net/Uri;)LJ1/c;
    .locals 0

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 5
    .line 6
    return-object p0
.end method

.method public P()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->m:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method protected Q()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-static {v0}, LW0/f;->m(Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->isAbsolute()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    :try_start_0
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    new-instance v0, LJ1/c$a;

    .line 47
    .line 48
    const-string v1, "Resource URI path must be a resource id."

    .line 49
    .line 50
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_0
    new-instance v0, LJ1/c$a;

    .line 55
    .line 56
    const-string v1, "Resource URI must not be empty"

    .line 57
    .line 58
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    new-instance v0, LJ1/c$a;

    .line 63
    .line 64
    const-string v1, "Resource URI path must be absolute."

    .line 65
    .line 66
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    :goto_0
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 71
    .line 72
    invoke-static {v0}, LW0/f;->h(Landroid/net/Uri;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/net/Uri;->isAbsolute()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    new-instance v0, LJ1/c$a;

    .line 88
    .line 89
    const-string v1, "Asset URI path must be absolute."

    .line 90
    .line 91
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_4
    :goto_1
    iget-object v0, p0, LJ1/c;->g:LJ1/b$b;

    .line 96
    .line 97
    sget-object v1, LJ1/b$b;->o:LJ1/b$b;

    .line 98
    .line 99
    if-ne v0, v1, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, LJ1/c;->r:Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    new-instance v0, LJ1/c$a;

    .line 107
    .line 108
    const-string v1, "Disk cache id must be set for dynamic cache choice"

    .line 109
    .line 110
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_6
    iget-object v0, p0, LJ1/c;->r:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_7

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    new-instance v0, LJ1/c$a;

    .line 126
    .line 127
    const-string v1, "Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC"

    .line 128
    .line 129
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_8
    :goto_2
    return-void

    .line 134
    :cond_9
    new-instance v0, LJ1/c$a;

    .line 135
    .line 136
    const-string v1, "Source must be set!"

    .line 137
    .line 138
    invoke-direct {v0, v1}, LJ1/c$a;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v0
.end method

.method public a()LJ1/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ1/c;->Q()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJ1/b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LJ1/b;-><init>(LJ1/c;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public c()Lx1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->o:Lx1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LJ1/b$b;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->g:LJ1/b$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LJ1/c;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, LJ1/c;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lx1/c;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->f:Lx1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/c;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public j()LJ1/b$c;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->b:LJ1/b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LJ1/d;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->l:LJ1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()LF1/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->n:LF1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Lx1/e;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->k:Lx1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Lx1/f;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->d:Lx1/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->p:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Lx1/g;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->e:Lx1/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Z
    .locals 1

    .line 1
    iget v0, p0, LJ1/c;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x30

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-static {v0}, LW0/f;->n(Landroid/net/Uri;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LJ1/c;->a:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-static {v0}, LJ1/c;->r(Landroid/net/Uri;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    return v0
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/c;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public u()Z
    .locals 1

    .line 1
    iget v0, p0, LJ1/c;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/c;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public x(Z)LJ1/c;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lx1/g;->c()Lx1/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-virtual {p0, p1}, LJ1/c;->M(Lx1/g;)LJ1/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-static {}, Lx1/g;->e()Lx1/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0
.end method

.method public y(Lx1/a;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->o:Lx1/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public z(LJ1/b$b;)LJ1/c;
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/c;->g:LJ1/b$b;

    .line 2
    .line 3
    return-object p0
.end method
