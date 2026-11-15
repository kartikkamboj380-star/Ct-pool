.class Lcom/facebook/react/views/textinput/n;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "target"

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topBlur"

    return-object v0
.end method
