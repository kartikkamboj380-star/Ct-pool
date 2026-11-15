.class public final Lcom/facebook/react/views/image/b;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/b$a;
    }
.end annotation


# static fields
.field public static final h:Lcom/facebook/react/views/image/b$a;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/image/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    iput p3, p0, Lcom/facebook/react/views/image/b;->a:I

    iput-object p4, p0, Lcom/facebook/react/views/image/b;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/react/views/image/b;->c:Ljava/lang/String;

    iput p6, p0, Lcom/facebook/react/views/image/b;->d:I

    iput p7, p0, Lcom/facebook/react/views/image/b;->e:I

    iput p8, p0, Lcom/facebook/react/views/image/b;->f:I

    iput p9, p0, Lcom/facebook/react/views/image/b;->g:I

    return-void
.end method

.method synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    .line 2
    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move v9, v2

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move v10, v2

    goto :goto_3

    :cond_3
    move/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v11, v2

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    move v12, v2

    goto :goto_5

    :cond_5
    move/from16 v12, p9

    :goto_5
    move-object v3, p0

    move v4, p1

    move v5, p2

    move/from16 v6, p3

    invoke-direct/range {v3 .. v12}, Lcom/facebook/react/views/image/b;-><init>(IIILjava/lang/String;Ljava/lang/String;IIII)V

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p9}, Lcom/facebook/react/views/image/b;-><init>(IIILjava/lang/String;Ljava/lang/String;IIII)V

    return-void
.end method

.method public static final a(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/react/views/image/b$a;->a(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/b;

    move-result-object p0

    return-object p0
.end method

.method private final b()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "uri"

    iget-object v2, p0, Lcom/facebook/react/views/image/b;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, p0, Lcom/facebook/react/views/image/b;->d:I

    int-to-double v1, v1

    const-string v3, "width"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget v1, p0, Lcom/facebook/react/views/image/b;->e:I

    int-to-double v1, v1

    const-string v3, "height"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "apply(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(II)Lcom/facebook/react/views/image/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/views/image/b$a;->b(II)Lcom/facebook/react/views/image/b;

    move-result-object p0

    return-object p0
.end method

.method public static final d(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/react/views/image/b$a;->c(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;

    move-result-object p0

    return-object p0
.end method

.method public static final e(II)Lcom/facebook/react/views/image/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/views/image/b$a;->d(II)Lcom/facebook/react/views/image/b;

    move-result-object p0

    return-object p0
.end method

.method public static final f(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/react/views/image/b$a;->e(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;

    move-result-object p0

    return-object p0
.end method

.method public static final g(I)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    invoke-virtual {v0, p0}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getCoalescingKey()S
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/image/b;->a:I

    int-to-short v0, v0

    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/views/image/b;->a:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "loaded"

    iget v2, p0, Lcom/facebook/react/views/image/b;->f:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "total"

    iget v2, p0, Lcom/facebook/react/views/image/b;->g:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lcom/facebook/react/views/image/b;->f:I

    int-to-double v1, v1

    iget v3, p0, Lcom/facebook/react/views/image/b;->g:I

    int-to-double v3, v3

    div-double/2addr v1, v3

    const-string v3, "progress"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    :cond_1
    const-string v1, "source"

    invoke-direct {p0}, Lcom/facebook/react/views/image/b;->b()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    goto :goto_0

    :cond_2
    const-string v1, "error"

    iget-object v2, p0, Lcom/facebook/react/views/image/b;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    iget v1, p0, Lcom/facebook/react/views/image/b;->a:I

    invoke-virtual {v0, v1}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
