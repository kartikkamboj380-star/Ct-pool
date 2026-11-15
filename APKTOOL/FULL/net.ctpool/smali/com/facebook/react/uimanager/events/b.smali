.class public Lcom/facebook/react/uimanager/events/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/e;


# static fields
.field private static final m:Lcom/facebook/react/uimanager/events/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/events/b;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/b;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/events/b;->m:Lcom/facebook/react/uimanager/events/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/b;->m:Lcom/facebook/react/uimanager/events/e;

    return-object v0
.end method


# virtual methods
.method public a(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Lcom/facebook/react/uimanager/events/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lcom/facebook/react/uimanager/events/d;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to emit event to JS, but the React instance isn\'t ready. Event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lcom/facebook/react/uimanager/events/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lcom/facebook/react/uimanager/events/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g()V
    .locals 0

    .line 1
    return-void
.end method

.method public h(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    return-void
.end method
