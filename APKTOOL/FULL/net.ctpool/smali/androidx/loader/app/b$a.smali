.class public Landroidx/loader/app/b$a;
.super Landroidx/lifecycle/q;
.source "SourceFile"

# interfaces
.implements LQ/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/loader/app/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final l:I

.field private final m:Landroid/os/Bundle;

.field private final n:LQ/c;

.field private o:Landroidx/lifecycle/l;

.field private p:Landroidx/loader/app/b$b;

.field private q:LQ/c;


# direct methods
.method constructor <init>(ILandroid/os/Bundle;LQ/c;LQ/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/q;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/loader/app/b$a;->l:I

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/loader/app/b$a;->m:Landroid/os/Bundle;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/loader/app/b$a;->q:LQ/c;

    .line 11
    .line 12
    invoke-virtual {p3, p1, p0}, LQ/c;->t(ILQ/c$b;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(LQ/c;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-boolean p1, Landroidx/loader/app/b;->c:Z

    .line 2
    .line 3
    const-string v0, "LoaderManager"

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "onLoadComplete: "

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-ne p1, v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, p2}, Landroidx/loader/app/b$a;->n(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-boolean p1, Landroidx/loader/app/b;->c:Z

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    const-string p1, "onLoadComplete was incorrectly called on a background thread"

    .line 46
    .line 47
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0, p2}, Landroidx/lifecycle/q;->l(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void
.end method

.method protected j()V
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/loader/app/b;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Starting: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    invoke-virtual {v0}, LQ/c;->w()V

    return-void
.end method

.method protected k()V
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/loader/app/b;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  Stopping: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LoaderManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    invoke-virtual {v0}, LQ/c;->x()V

    return-void
.end method

.method public m(Landroidx/lifecycle/r;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/lifecycle/LiveData;->m(Landroidx/lifecycle/r;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/loader/app/b$a;->o:Landroidx/lifecycle/l;

    iput-object p1, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    return-void
.end method

.method public n(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/lifecycle/q;->n(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/loader/app/b$a;->q:LQ/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LQ/c;->u()V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/loader/app/b$a;->q:LQ/c;

    :cond_0
    return-void
.end method

.method o(Z)LQ/c;
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/loader/app/b;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "  Destroying: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "LoaderManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 28
    .line 29
    invoke-virtual {v0}, LQ/c;->b()Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 33
    .line 34
    invoke-virtual {v0}, LQ/c;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroidx/loader/app/b$a;->m(Landroidx/lifecycle/r;)V

    .line 42
    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/loader/app/b$b;->d()V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object v1, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 50
    .line 51
    invoke-virtual {v1, p0}, LQ/c;->z(LQ/c$b;)V

    .line 52
    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/loader/app/b$b;->c()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    :cond_2
    if-eqz p1, :cond_4

    .line 63
    .line 64
    :cond_3
    iget-object p1, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 65
    .line 66
    invoke-virtual {p1}, LQ/c;->u()V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/loader/app/b$a;->q:LQ/c;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    iget-object p1, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 73
    .line 74
    return-object p1
.end method

.method public p(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mId="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/loader/app/b$a;->l:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mArgs="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/loader/app/b$a;->m:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoader="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, LQ/c;->g(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCallbacks="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4, p3}, Landroidx/loader/app/b$b;->b(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mData="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/loader/app/b$a;->q()LQ/c;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p2, p4}, LQ/c;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mStarted="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->g()Z

    move-result p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    return-void
.end method

.method q()LQ/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 2
    .line 3
    return-object v0
.end method

.method r()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/loader/app/b$a;->o:Landroidx/lifecycle/l;

    iget-object v1, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-super {p0, v1}, Landroidx/lifecycle/LiveData;->m(Landroidx/lifecycle/r;)V

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/LiveData;->h(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V

    :cond_0
    return-void
.end method

.method s(Landroidx/lifecycle/l;Landroidx/loader/app/a$a;)LQ/c;
    .locals 2

    .line 1
    new-instance v0, Landroidx/loader/app/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/loader/app/b$b;-><init>(LQ/c;Landroidx/loader/app/a$a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/LiveData;->h(Landroidx/lifecycle/l;Landroidx/lifecycle/r;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Landroidx/loader/app/b$a;->m(Landroidx/lifecycle/r;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-object p1, p0, Landroidx/loader/app/b$a;->o:Landroidx/lifecycle/l;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/loader/app/b$a;->p:Landroidx/loader/app/b$b;

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    .line 23
    .line 24
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/loader/app/b$a;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/loader/app/b$a;->n:LQ/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "{"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
