.class public final Lcom/facebook/react/uimanager/events/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;
    .locals 11

    .line 1
    const-string v0, "touchEventCoalescingKeyHelper"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/uimanager/events/q;->a()Landroidx/core/util/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/util/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/events/q;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/events/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/q;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-static {p4}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "assertNotNull(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    check-cast v5, Landroid/view/MotionEvent;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-static/range {v1 .. v10}, Lcom/facebook/react/uimanager/events/q;->b(Lcom/facebook/react/uimanager/events/q;IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)V

    return-object v0
.end method
