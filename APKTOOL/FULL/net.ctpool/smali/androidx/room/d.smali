.class public final Landroidx/room/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/h;
.implements Landroidx/room/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/d$a;,
        Landroidx/room/d$c;,
        Landroidx/room/d$b;
    }
.end annotation


# instance fields
.field private final m:LZ/h;

.field public final n:Landroidx/room/c;

.field private final o:Landroidx/room/d$a;


# direct methods
.method public constructor <init>(LZ/h;Landroidx/room/c;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "autoCloser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/room/d;->m:LZ/h;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/room/d;->n:Landroidx/room/c;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/room/d;->a()LZ/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Landroidx/room/c;->k(LZ/h;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Landroidx/room/d$a;

    .line 26
    .line 27
    invoke-direct {p1, p2}, Landroidx/room/d$a;-><init>(Landroidx/room/c;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/room/d;->o:Landroidx/room/d$a;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()LZ/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/d;->m:LZ/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Landroidx/room/d;->o:Landroidx/room/d$a;

    invoke-virtual {v0}, Landroidx/room/d$a;->close()V

    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/room/d;->m:LZ/h;

    invoke-interface {v0}, LZ/h;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l0()LZ/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/d;->o:Landroidx/room/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/d$a;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/d;->o:Landroidx/room/d$a;

    .line 7
    .line 8
    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/room/d;->m:LZ/h;

    invoke-interface {v0, p1}, LZ/h;->setWriteAheadLoggingEnabled(Z)V

    return-void
.end method
