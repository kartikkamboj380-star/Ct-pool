.class public Lcom/facebook/react/uimanager/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private final b:[F

.field private c:Z

.field private d:J

.field private final e:Landroid/view/ViewGroup;

.field private final f:Lcom/facebook/react/uimanager/events/r;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/react/uimanager/u;->a:I

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/facebook/react/uimanager/u;->b:[F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/u;->c:Z

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/facebook/react/uimanager/u;->d:J

    new-instance v0, Lcom/facebook/react/uimanager/events/r;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/r;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/u;->f:Lcom/facebook/react/uimanager/events/r;

    iput-object p1, p0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    return-void
.end method

.method private a(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/u;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string p1, "ReactNative"

    const-string p2, "Can\'t cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?"

    invoke-static {p1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/u;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Expected to not have already sent a cancel for this gesture"

    invoke-static {v0, v2}, LO1/a;->b(ZLjava/lang/String;)V

    invoke-static {p2}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/uimanager/events/e;

    iget-object v0, p0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v2

    iget v3, p0, Lcom/facebook/react/uimanager/u;->a:I

    sget-object v4, Lcom/facebook/react/uimanager/events/s;->r:Lcom/facebook/react/uimanager/events/s;

    iget-wide v6, p0, Lcom/facebook/react/uimanager/u;->d:J

    iget-object v0, p0, Lcom/facebook/react/uimanager/u;->b:[F

    const/4 v5, 0x0

    aget v8, v0, v5

    aget v9, v0, v1

    iget-object v10, p0, Lcom/facebook/react/uimanager/u;->f:Lcom/facebook/react/uimanager/events/r;

    move-object v5, p1

    invoke-static/range {v2 .. v10}, Lcom/facebook/react/uimanager/events/q;->h(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private b(Landroid/view/MotionEvent;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v1, p0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/facebook/react/uimanager/u;->b:[F

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lcom/facebook/react/uimanager/f0;->c(FFLandroid/view/ViewGroup;[F[I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    const-string v3, "ReactNative"

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v2, :cond_1

    iget v2, v0, Lcom/facebook/react/uimanager/u;->a:I

    if-eq v2, v4, :cond_0

    const-string v2, "Got DOWN touch before receiving UP or CANCEL from last gesture"

    invoke-static {v3, v2}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iput-boolean v6, v0, Lcom/facebook/react/uimanager/u;->c:Z

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/facebook/react/uimanager/u;->d:J

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/u;->b(Landroid/view/MotionEvent;)I

    move-result v2

    iput v2, v0, Lcom/facebook/react/uimanager/u;->a:I

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v7

    iget v8, v0, Lcom/facebook/react/uimanager/u;->a:I

    sget-object v9, Lcom/facebook/react/uimanager/events/s;->o:Lcom/facebook/react/uimanager/events/s;

    iget-wide v11, v0, Lcom/facebook/react/uimanager/u;->d:J

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->b:[F

    aget v13, v2, v6

    aget v14, v2, v5

    :goto_0
    iget-object v15, v0, Lcom/facebook/react/uimanager/u;->f:Lcom/facebook/react/uimanager/events/r;

    move-object/from16 v10, p1

    invoke-static/range {v7 .. v15}, Lcom/facebook/react/uimanager/events/q;->h(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    goto/16 :goto_2

    :cond_1
    iget-boolean v7, v0, Lcom/facebook/react/uimanager/u;->c:Z

    if-eqz v7, :cond_2

    return-void

    :cond_2
    iget v7, v0, Lcom/facebook/react/uimanager/u;->a:I

    if-ne v7, v4, :cond_3

    const-string v1, "Unexpected state: received touch event but didn\'t get starting ACTION_DOWN for this gesture before"

    invoke-static {v3, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_3
    const-wide/high16 v7, -0x8000000000000000L

    if-ne v2, v5, :cond_4

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/u;->b(Landroid/view/MotionEvent;)I

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v9

    iget v10, v0, Lcom/facebook/react/uimanager/u;->a:I

    sget-object v11, Lcom/facebook/react/uimanager/events/s;->p:Lcom/facebook/react/uimanager/events/s;

    iget-wide v13, v0, Lcom/facebook/react/uimanager/u;->d:J

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->b:[F

    aget v15, v2, v6

    aget v16, v2, v5

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->f:Lcom/facebook/react/uimanager/events/r;

    move-object/from16 v12, p1

    move-object/from16 v17, v2

    invoke-static/range {v9 .. v17}, Lcom/facebook/react/uimanager/events/q;->h(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :goto_1
    iput v4, v0, Lcom/facebook/react/uimanager/u;->a:I

    iput-wide v7, v0, Lcom/facebook/react/uimanager/u;->d:J

    goto/16 :goto_2

    :cond_4
    const/4 v9, 0x2

    if-ne v2, v9, :cond_5

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/uimanager/u;->b(Landroid/view/MotionEvent;)I

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v7

    iget v8, v0, Lcom/facebook/react/uimanager/u;->a:I

    sget-object v9, Lcom/facebook/react/uimanager/events/s;->q:Lcom/facebook/react/uimanager/events/s;

    iget-wide v11, v0, Lcom/facebook/react/uimanager/u;->d:J

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->b:[F

    aget v13, v2, v6

    aget v14, v2, v5

    goto :goto_0

    :cond_5
    const/4 v9, 0x5

    if-ne v2, v9, :cond_6

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v7

    iget v8, v0, Lcom/facebook/react/uimanager/u;->a:I

    sget-object v9, Lcom/facebook/react/uimanager/events/s;->o:Lcom/facebook/react/uimanager/events/s;

    iget-wide v11, v0, Lcom/facebook/react/uimanager/u;->d:J

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->b:[F

    aget v13, v2, v6

    aget v14, v2, v5

    goto :goto_0

    :cond_6
    const/4 v9, 0x6

    if-ne v2, v9, :cond_7

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->e:Landroid/view/ViewGroup;

    invoke-static {v2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v7

    iget v8, v0, Lcom/facebook/react/uimanager/u;->a:I

    sget-object v9, Lcom/facebook/react/uimanager/events/s;->p:Lcom/facebook/react/uimanager/events/s;

    iget-wide v11, v0, Lcom/facebook/react/uimanager/u;->d:J

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->b:[F

    aget v13, v2, v6

    aget v14, v2, v5

    goto/16 :goto_0

    :cond_7
    const/4 v5, 0x3

    if-ne v2, v5, :cond_9

    iget-object v2, v0, Lcom/facebook/react/uimanager/u;->f:Lcom/facebook/react/uimanager/events/r;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/facebook/react/uimanager/events/r;->c(J)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-direct/range {p0 .. p2}, Lcom/facebook/react/uimanager/u;->a(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    goto :goto_1

    :cond_8
    const-string v1, "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN"

    invoke-static {v3, v1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Warning : touch event was ignored. Action="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Target="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Lcom/facebook/react/uimanager/u;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/u;->c:Z

    return-void
.end method

.method public e(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/u;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/u;->a(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/u;->c:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/facebook/react/uimanager/u;->a:I

    return-void
.end method
