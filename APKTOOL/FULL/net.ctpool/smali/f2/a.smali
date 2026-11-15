.class public final Lf2/a;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/react/bridge/WritableMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)V
    .locals 1

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p3, p4}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lf2/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lf2/a;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/a;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
