.class public final Lcom/th3rdwave/safeareacontext/b;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/b$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/th3rdwave/safeareacontext/b$a;


# instance fields
.field private final a:Lcom/th3rdwave/safeareacontext/a;

.field private final b:Lcom/th3rdwave/safeareacontext/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/th3rdwave/safeareacontext/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/th3rdwave/safeareacontext/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/b;->c:Lcom/th3rdwave/safeareacontext/b$a;

    return-void
.end method

.method public constructor <init>(IILcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V
    .locals 0

    const-string p1, "mInsets"

    invoke-static {p3, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "mFrame"

    invoke-static {p4, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(I)V

    iput-object p3, p0, Lcom/th3rdwave/safeareacontext/b;->a:Lcom/th3rdwave/safeareacontext/a;

    iput-object p4, p0, Lcom/th3rdwave/safeareacontext/b;->b:Lcom/th3rdwave/safeareacontext/c;

    return-void
.end method


# virtual methods
.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 3

    const-string v0, "rctEventEmitter"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/b;->a:Lcom/th3rdwave/safeareacontext/a;

    invoke-static {v1}, Lcom/th3rdwave/safeareacontext/q;->b(Lcom/th3rdwave/safeareacontext/a;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const-string v2, "insets"

    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/b;->b:Lcom/th3rdwave/safeareacontext/c;

    invoke-static {v1}, Lcom/th3rdwave/safeareacontext/q;->d(Lcom/th3rdwave/safeareacontext/c;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const-string v2, "frame"

    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v1

    invoke-virtual {p0}, Lcom/th3rdwave/safeareacontext/b;->getEventName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2, v0}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topInsetsChange"

    return-object v0
.end method
