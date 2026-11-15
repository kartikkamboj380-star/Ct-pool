.class final Lcom/swmansion/rnscreens/K$b$d;
.super Lcom/swmansion/rnscreens/K$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/K$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/K$b$d$a;
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/swmansion/rnscreens/K$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public h(Lcom/swmansion/rnscreens/K$a;)I
    .locals 1

    .line 1
    const-string v0, "capitalize"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/swmansion/rnscreens/K$b$d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/16 v0, 0x1000

    goto :goto_0

    :cond_0
    new-instance p1, Li5/k;

    invoke-direct {p1}, Li5/k;-><init>()V

    throw p1

    :cond_1
    const/16 v0, 0x4000

    goto :goto_0

    :cond_2
    const/16 v0, 0x2000

    :cond_3
    :goto_0
    return v0
.end method
