.class public Lw1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/x;


# instance fields
.field private final a:Lw1/x;

.field private final b:Lw1/z;


# direct methods
.method public constructor <init>(Lw1/x;Lw1/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw1/u;->a:Lw1/x;

    .line 5
    .line 6
    iput-object p2, p0, Lw1/u;->b:Lw1/z;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(LO0/m;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/u;->a:Lw1/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lw1/x;->b(LO0/m;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/u;->a:Lw1/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lw1/x;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/Object;LS0/a;)LS0/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/u;->b:Lw1/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lw1/z;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw1/u;->a:Lw1/x;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Lw1/x;->d(Ljava/lang/Object;LS0/a;)LS0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public e(LO0/m;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/u;->a:Lw1/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lw1/x;->e(LO0/m;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public get(Ljava/lang/Object;)LS0/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/u;->a:Lw1/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lw1/x;->get(Ljava/lang/Object;)LS0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw1/u;->b:Lw1/z;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, p1}, Lw1/z;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v1, p1}, Lw1/z;->a(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-object v0
.end method
