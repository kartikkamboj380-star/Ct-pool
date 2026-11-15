.class public final Landroidx/room/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/h$c;


# instance fields
.field private final a:LZ/h$c;

.field private final b:Landroidx/room/c;


# direct methods
.method public constructor <init>(LZ/h$c;Landroidx/room/c;)V
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
    iput-object p1, p0, Landroidx/room/e;->a:LZ/h$c;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/room/e;->b:Landroidx/room/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LZ/h$b;)LZ/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/e;->b(LZ/h$b;)Landroidx/room/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(LZ/h$b;)Landroidx/room/d;
    .locals 2

    .line 1
    const-string v0, "configuration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/d;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/room/e;->a:LZ/h$c;

    .line 9
    .line 10
    invoke-interface {v1, p1}, LZ/h$c;->a(LZ/h$b;)LZ/h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, Landroidx/room/e;->b:Landroidx/room/c;

    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Landroidx/room/d;-><init>(LZ/h;Landroidx/room/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
