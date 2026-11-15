.class Lcom/facebook/react/uimanager/events/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/uimanager/events/d;Lcom/facebook/react/uimanager/events/d;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, -0x1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x1

    if-nez p2, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    move-result-wide v3

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    move-result-wide p1

    sub-long/2addr v3, p1

    const-wide/16 p1, 0x0

    cmp-long p1, v3, p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    if-gez p1, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/facebook/react/uimanager/events/d;

    check-cast p2, Lcom/facebook/react/uimanager/events/d;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/uimanager/events/f$a;->a(Lcom/facebook/react/uimanager/events/d;Lcom/facebook/react/uimanager/events/d;)I

    move-result p1

    return p1
.end method
