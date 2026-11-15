.class public abstract Lcom/facebook/react/uimanager/events/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/d$b;
    }
.end annotation


# static fields
.field private static sUniqueID:I


# instance fields
.field private mEventAnimationDriverMatchSpec:Lcom/facebook/react/uimanager/events/d$b;

.field private mInitialized:Z

.field private mSurfaceId:I

.field private mTimestampMs:J

.field private mUniqueID:I

.field private mViewTag:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/facebook/react/uimanager/events/d;->sUniqueID:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/d;->sUniqueID:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/d;->mUniqueID:I

    return-void
.end method

.method protected constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/facebook/react/uimanager/events/d;->sUniqueID:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/d;->sUniqueID:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/d;->mUniqueID:I

    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/events/d;->init(I)V

    return-void
.end method

.method protected constructor <init>(II)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/facebook/react/uimanager/events/d;->sUniqueID:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/d;->sUniqueID:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/d;->mUniqueID:I

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public coalesce(Lcom/facebook/react/uimanager/events/d;)Lcom/facebook/react/uimanager/events/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/d;",
            ")",
            "Lcom/facebook/react/uimanager/events/d;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    move-object p1, p0

    :cond_0
    return-object p1
.end method

.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 10

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v4

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->canCoalesce()Z

    move-result v6

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getCoalescingKey()S

    move-result v7

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v8

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventCategory()I

    move-result v9

    move-object v2, p1

    invoke-interface/range {v2 .. v9}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/events/d;->dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    :goto_0
    return-void
.end method

.method final dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/d;->mInitialized:Z

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->onDispose()V

    return-void
.end method

.method protected experimental_isSynchronous()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCoalescingKey()S
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/d$b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/d;->mEventAnimationDriverMatchSpec:Lcom/facebook/react/uimanager/events/d$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/events/d$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/d$a;-><init>(Lcom/facebook/react/uimanager/events/d;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/d;->mEventAnimationDriverMatchSpec:Lcom/facebook/react/uimanager/events/d$b;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/d;->mEventAnimationDriverMatchSpec:Lcom/facebook/react/uimanager/events/d$b;

    return-object v0
.end method

.method protected getEventCategory()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getEventName()Ljava/lang/String;
.end method

.method public final getSurfaceId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->mSurfaceId:I

    return v0
.end method

.method public final getTimestampMs()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/uimanager/events/d;->mTimestampMs:J

    return-wide v0
.end method

.method public getUniqueID()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->mUniqueID:I

    return v0
.end method

.method public final getViewTag()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->mViewTag:I

    return v0
.end method

.method protected init(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    return-void
.end method

.method protected init(II)V
    .locals 2

    .line 2
    invoke-static {}, LS1/k;->c()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/react/uimanager/events/d;->init(IIJ)V

    return-void
.end method

.method protected init(IIJ)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/facebook/react/uimanager/events/d;->mSurfaceId:I

    iput p2, p0, Lcom/facebook/react/uimanager/events/d;->mViewTag:I

    iput-wide p3, p0, Lcom/facebook/react/uimanager/events/d;->mTimestampMs:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/d;->mInitialized:Z

    return-void
.end method

.method isInitialized()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/d;->mInitialized:Z

    return v0
.end method

.method public onDispose()V
    .locals 0

    return-void
.end method
