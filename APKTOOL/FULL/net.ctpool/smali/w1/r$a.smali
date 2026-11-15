.class Lw1/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/r;->a(LO0/o;LR0/d;Lw1/x$a;)Lw1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LR0/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw1/r$a;->b(LR0/h;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LR0/h;)I
    .locals 0

    .line 1
    invoke-interface {p1}, LR0/h;->size()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
