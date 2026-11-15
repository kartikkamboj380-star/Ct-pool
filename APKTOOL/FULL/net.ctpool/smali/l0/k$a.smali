.class public final Ll0/k$a;
.super Ll0/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-string v0, "workerClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ll0/u$a;-><init>(Ljava/lang/Class;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ll0/u$a;->h()Lq0/u;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-class v0, Landroidx/work/OverwritingInputMerger;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p1, Lq0/u;->d:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public bridge synthetic c()Ll0/u;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll0/k$a;->l()Ll0/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic g()Ll0/u$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll0/k$a;->m()Ll0/k$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()Ll0/k;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ll0/u$a;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ll0/u$a;->h()Lq0/u;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lq0/u;->j:Ll0/b;

    .line 12
    .line 13
    invoke-virtual {v0}, Ll0/b;->h()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v1, "Cannot set backoff criteria on an idle mode job"

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    new-instance v0, Ll0/k;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ll0/k;-><init>(Ll0/k$a;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public m()Ll0/k$a;
    .locals 0

    .line 1
    return-object p0
.end method
