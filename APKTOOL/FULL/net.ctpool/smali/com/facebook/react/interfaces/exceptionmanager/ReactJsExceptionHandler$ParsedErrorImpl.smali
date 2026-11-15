.class final Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ParsedErrorImpl"
.end annotation


# instance fields
.field private final exceptionId:I

.field private final frames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final isFatal:Z

.field private final message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;",
            ">;",
            "Ljava/lang/String;",
            "IZ)V"
        }
    .end annotation

    const-string v0, "frames"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    iput p3, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    iput-boolean p4, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;Ljava/util/ArrayList;Ljava/lang/String;IZILjava/lang/Object;)Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->copy(Ljava/util/ArrayList;Ljava/lang/String;IZ)Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    return v0
.end method

.method public final copy(Ljava/util/ArrayList;Ljava/lang/String;IZ)Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;",
            ">;",
            "Ljava/lang/String;",
            "IZ)",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;"
        }
    .end annotation

    const-string v0, "frames"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;-><init>(Ljava/util/ArrayList;Ljava/lang/String;IZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;

    iget-object v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    iget v3, p1, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    iget-boolean p1, p1, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getExceptionId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    return v0
.end method

.method public getFrames()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    return-object v0
.end method

.method public bridge synthetic getFrames()Ljava/util/List;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->getFrames()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isFatal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->frames:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->message:Ljava/lang/String;

    iget v2, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->exceptionId:I

    iget-boolean v3, p0, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;->isFatal:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ParsedErrorImpl(frames="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", message="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", exceptionId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isFatal="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
