.class public abstract Lw5/p;
.super Lw5/r;
.source "SourceFile"

# interfaces
.implements LD5/f;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1
    sget-object v1, Lw5/c;->s:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lw5/r;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method protected b()LD5/a;
    .locals 1

    .line 1
    invoke-static {p0}, Lw5/w;->e(Lw5/p;)LD5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f()LD5/f$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw5/r;->l()LD5/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LD5/f;

    .line 6
    .line 7
    invoke-interface {v0}, LD5/f;->f()LD5/f$a;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, LD5/f;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
