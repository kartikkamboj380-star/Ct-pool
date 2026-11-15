.class public final Lcom/facebook/react/views/scroll/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/scroll/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/h$a$a;
    }
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
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "type"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/views/scroll/h$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    const-string p1, "topMomentumScrollEnd"

    goto :goto_0

    :cond_0
    new-instance p1, Li5/k;

    invoke-direct {p1}, Li5/k;-><init>()V

    throw p1

    :cond_1
    const-string p1, "topMomentumScrollBegin"

    goto :goto_0

    :cond_2
    const-string p1, "topScroll"

    goto :goto_0

    :cond_3
    const-string p1, "topScrollEndDrag"

    goto :goto_0

    :cond_4
    const-string p1, "topScrollBeginDrag"

    :goto_0
    return-object p1
.end method
