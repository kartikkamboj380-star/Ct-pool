.class Lcom/facebook/react/views/textinput/q;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    iput-object p3, p0, Lcom/facebook/react/views/textinput/q;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, -0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/react/views/textinput/q;-><init>(IILjava/lang/String;)V

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

    const-string v1, "key"

    iget-object v2, p0, Lcom/facebook/react/views/textinput/q;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topKeyPress"

    return-object v0
.end method
