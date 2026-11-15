.class public abstract Lcom/facebook/react/views/scroll/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/e$a;,
        Lcom/facebook/react/views/scroll/e$b;,
        Lcom/facebook/react/views/scroll/e$c;
    }
.end annotation


# direct methods
.method public static a()Ljava/util/Map;
    .locals 7

    .line 1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v1, "scrollTo"

    const-string v3, "scrollToEnd"

    const-string v5, "flashScrollIndicators"

    invoke-static/range {v1 .. v6}, LS1/f;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 1
    invoke-static {p0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 p3, 0x3

    if-ne p2, p3, :cond_0

    invoke-interface {p0, p1}, Lcom/facebook/react/views/scroll/e$a;->flashScrollIndicators(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "Unsupported command %d received by %s."

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/e;->e(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void

    :cond_2
    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/e;->d(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public static c(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    invoke-static {p0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "scrollToEnd"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "flashScrollIndicators"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "scrollTo"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p2, "Unsupported command %s received by %s."

    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/e;->e(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void

    :pswitch_1
    invoke-interface {p0, p1}, Lcom/facebook/react/views/scroll/e$a;->flashScrollIndicators(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/bridge/ReadableArray;

    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/e;->d(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x17f88dd8 -> :sswitch_2
        0x1b1bf01 -> :sswitch_1
        0x7a7e8d93 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static d(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x2

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result p2

    new-instance v2, Lcom/facebook/react/views/scroll/e$b;

    invoke-direct {v2, v0, v1, p2}, Lcom/facebook/react/views/scroll/e$b;-><init>(IIZ)V

    invoke-interface {p0, p1, v2}, Lcom/facebook/react/views/scroll/e$a;->scrollTo(Ljava/lang/Object;Lcom/facebook/react/views/scroll/e$b;)V

    return-void
.end method

.method private static e(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result p2

    new-instance v0, Lcom/facebook/react/views/scroll/e$c;

    invoke-direct {v0, p2}, Lcom/facebook/react/views/scroll/e$c;-><init>(Z)V

    invoke-interface {p0, p1, v0}, Lcom/facebook/react/views/scroll/e$a;->scrollToEnd(Ljava/lang/Object;Lcom/facebook/react/views/scroll/e$c;)V

    return-void
.end method
