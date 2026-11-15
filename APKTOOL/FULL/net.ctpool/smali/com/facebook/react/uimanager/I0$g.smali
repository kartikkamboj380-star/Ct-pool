.class Lcom/facebook/react/uimanager/I0$g;
.super Lcom/facebook/react/uimanager/I0$m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/I0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# instance fields
.field private final i:I


# direct methods
.method public constructor <init>(Lx2/a;Ljava/lang/reflect/Method;I)V
    .locals 2

    .line 1
    const-string v0, "mixed"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/facebook/react/uimanager/I0$m;-><init>(Lx2/a;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/facebook/react/uimanager/J0;)V

    iput p3, p0, Lcom/facebook/react/uimanager/I0$g;->i:I

    return-void
.end method

.method public constructor <init>(Lx2/b;Ljava/lang/reflect/Method;II)V
    .locals 6

    .line 2
    const-string v2, "mixed"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/uimanager/I0$m;-><init>(Lx2/b;Ljava/lang/String;Ljava/lang/reflect/Method;ILcom/facebook/react/uimanager/J0;)V

    iput p4, p0, Lcom/facebook/react/uimanager/I0$g;->i:I

    return-void
.end method


# virtual methods
.method protected c(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    iget p1, p0, Lcom/facebook/react/uimanager/I0$g;->i:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
