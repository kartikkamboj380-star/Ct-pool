.class public final Lcom/facebook/react/views/view/j;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/j$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/react/views/view/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/view/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/view/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/view/j;->a:Lcom/facebook/react/views/view/j$a;

    return-void
.end method

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
    .locals 2

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "createMap(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topClick"

    return-object v0
.end method
