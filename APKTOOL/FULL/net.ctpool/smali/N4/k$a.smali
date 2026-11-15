.class final LN4/k$a;
.super Lo5/k;
.source "SourceFile"

# interfaces
.implements Lv5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN4/k;-><init>(LY3/f;LP4/f;Lm5/g;LN4/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LN4/k;

.field final synthetic s:Lm5/g;

.field final synthetic t:LN4/F;


# direct methods
.method constructor <init>(LN4/k;Lm5/g;LN4/F;Lm5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN4/k$a;->r:LN4/k;

    .line 2
    .line 3
    iput-object p2, p0, LN4/k$a;->s:Lm5/g;

    .line 4
    .line 5
    iput-object p3, p0, LN4/k$a;->t:LN4/F;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lo5/k;-><init>(ILm5/d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic v(Ljava/lang/String;LY3/n;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN4/k$a;->x(Ljava/lang/String;LY3/n;)V

    return-void
.end method

.method private static final x(Ljava/lang/String;LY3/n;)V
    .locals 0

    .line 1
    const-string p0, "FirebaseSessions"

    .line 2
    .line 3
    const-string p1, "FirebaseApp instance deleted. Sessions library will stop collecting data."

    .line 4
    .line 5
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    sget-object p0, LN4/H;->m:LN4/H;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, LN4/H;->a(LN4/D;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lm5/d;)Lm5/d;
    .locals 3

    .line 1
    new-instance p1, LN4/k$a;

    .line 2
    .line 3
    iget-object v0, p0, LN4/k$a;->r:LN4/k;

    .line 4
    .line 5
    iget-object v1, p0, LN4/k$a;->s:Lm5/g;

    .line 6
    .line 7
    iget-object v2, p0, LN4/k$a;->t:LN4/F;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, LN4/k$a;-><init>(LN4/k;Lm5/g;LN4/F;Lm5/d;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LH5/I;

    .line 2
    .line 3
    check-cast p2, Lm5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LN4/k$a;->w(LH5/I;Lm5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN4/k$a;->q:I

    .line 6
    .line 7
    const-string v2, "FirebaseSessions"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Li5/n;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p1, LO4/a;->a:LO4/a;

    .line 37
    .line 38
    iput v4, p0, LN4/k$a;->q:I

    .line 39
    .line 40
    invoke-virtual {p1, p0}, LO4/a;->c(Lm5/d;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Iterable;

    .line 54
    .line 55
    instance-of v1, p1, Ljava/util/Collection;

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    move-object v1, p1

    .line 60
    check-cast v1, Ljava/util/Collection;

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_8

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, LO4/b;

    .line 84
    .line 85
    invoke-interface {v1}, LO4/b;->b()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object p1, p0, LN4/k$a;->r:LN4/k;

    .line 92
    .line 93
    invoke-static {p1}, LN4/k;->b(LN4/k;)LP4/f;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput v3, p0, LN4/k$a;->q:I

    .line 98
    .line 99
    invoke-virtual {p1, p0}, LP4/f;->g(Lm5/d;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v0, :cond_6

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_6
    :goto_1
    iget-object p1, p0, LN4/k$a;->r:LN4/k;

    .line 107
    .line 108
    invoke-static {p1}, LN4/k;->b(LN4/k;)LP4/f;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, LP4/f;->d()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_7

    .line 117
    .line 118
    const-string p1, "Sessions SDK disabled. Not listening to lifecycle events."

    .line 119
    .line 120
    :goto_2
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    new-instance p1, LN4/D;

    .line 125
    .line 126
    iget-object v0, p0, LN4/k$a;->s:Lm5/g;

    .line 127
    .line 128
    invoke-direct {p1, v0}, LN4/D;-><init>(Lm5/g;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, LN4/k$a;->t:LN4/F;

    .line 132
    .line 133
    invoke-virtual {p1, v0}, LN4/D;->i(LN4/F;)V

    .line 134
    .line 135
    .line 136
    sget-object v0, LN4/H;->m:LN4/H;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, LN4/H;->a(LN4/D;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, LN4/k$a;->r:LN4/k;

    .line 142
    .line 143
    invoke-static {p1}, LN4/k;->a(LN4/k;)LY3/f;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance v0, LN4/j;

    .line 148
    .line 149
    invoke-direct {v0}, LN4/j;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0}, LY3/f;->h(LY3/g;)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_8
    :goto_3
    const-string p1, "No Sessions subscribers. Not listening to lifecycle events."

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :goto_4
    sget-object p1, Li5/u;->a:Li5/u;

    .line 160
    .line 161
    return-object p1
.end method

.method public final w(LH5/I;Lm5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN4/k$a;->d(Ljava/lang/Object;Lm5/d;)Lm5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LN4/k$a;

    .line 6
    .line 7
    sget-object p2, Li5/u;->a:Li5/u;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LN4/k$a;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
