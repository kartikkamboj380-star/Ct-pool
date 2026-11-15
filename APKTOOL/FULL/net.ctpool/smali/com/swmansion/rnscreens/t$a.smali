.class public final Lcom/swmansion/rnscreens/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/swmansion/rnscreens/t$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/swmansion/rnscreens/t$a;Lcom/swmansion/rnscreens/r;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/t$a;->c(Lcom/swmansion/rnscreens/r;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/swmansion/rnscreens/t$a;Lcom/swmansion/rnscreens/r;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/t$a;->d(Lcom/swmansion/rnscreens/r;)Z

    move-result p0

    return p0
.end method

.method private final c(Lcom/swmansion/rnscreens/r;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/l;->getStackPresentation()Lcom/swmansion/rnscreens/l$d;

    move-result-object p1

    sget-object v0, Lcom/swmansion/rnscreens/l$d;->o:Lcom/swmansion/rnscreens/l$d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final d(Lcom/swmansion/rnscreens/r;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_1

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getStackAnimation()Lcom/swmansion/rnscreens/l$c;

    move-result-object v0

    sget-object v1, Lcom/swmansion/rnscreens/l$c;->p:Lcom/swmansion/rnscreens/l$c;

    if-eq v0, v1, :cond_1

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getStackAnimation()Lcom/swmansion/rnscreens/l$c;

    move-result-object v0

    sget-object v1, Lcom/swmansion/rnscreens/l$c;->s:Lcom/swmansion/rnscreens/l$c;

    if-eq v0, v1, :cond_1

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/l;->getStackAnimation()Lcom/swmansion/rnscreens/l$c;

    move-result-object p1

    sget-object v0, Lcom/swmansion/rnscreens/l$c;->t:Lcom/swmansion/rnscreens/l$c;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
