.class public Lcom/facebook/react/devsupport/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/String;

.field private final f:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IILcom/facebook/react/devsupport/g0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/h0$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/react/devsupport/h0$a;->b:Ljava/lang/String;

    iput p3, p0, Lcom/facebook/react/devsupport/h0$a;->c:I

    iput p4, p0, Lcom/facebook/react/devsupport/h0$a;->d:I

    if-eqz p1, :cond_0

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/devsupport/h0$a;->e:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/facebook/react/devsupport/h0$a;->f:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IIZLcom/facebook/react/devsupport/g0;)V
    .locals 0

    .line 4
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/h0$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/react/devsupport/h0$a;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/react/devsupport/h0$a;->b:Ljava/lang/String;

    iput p4, p0, Lcom/facebook/react/devsupport/h0$a;->c:I

    iput p5, p0, Lcom/facebook/react/devsupport/h0$a;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/devsupport/h0$a;->f:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/facebook/react/devsupport/g0;)V
    .locals 0

    .line 6
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/devsupport/h0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/h0$a;->c:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/h0$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/h0$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/h0$a;->f:Z

    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/h0$a;->d:I

    return v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/h0$a;->e:Ljava/lang/String;

    return-object v0
.end method
