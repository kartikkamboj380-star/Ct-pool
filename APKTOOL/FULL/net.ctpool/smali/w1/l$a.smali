.class Lw1/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/l;->a(LO0/o;LR0/d;Lw1/x$a;ZZLw1/n$b;)Lw1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw1/l;


# direct methods
.method constructor <init>(Lw1/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw1/l$a;->a:Lw1/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LD1/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw1/l$a;->b(LD1/d;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LD1/d;)I
    .locals 0

    .line 1
    invoke-interface {p1}, LD1/d;->T0()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
