.class public abstract LR4/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()LR4/q;
    .locals 1

    .line 1
    new-instance v0, LR4/q$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LR4/q$a;-><init>(LR4/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public abstract b(LY4/a;)Ljava/lang/Object;
.end method

.method public final c(Ljava/lang/Object;)LR4/f;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, LU4/f;

    .line 2
    .line 3
    invoke-direct {v0}, LU4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, LR4/q;->d(LY4/c;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, LU4/f;->j1()LR4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    new-instance v0, LR4/g;

    .line 16
    .line 17
    invoke-direct {v0, p1}, LR4/g;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public abstract d(LY4/c;Ljava/lang/Object;)V
.end method
