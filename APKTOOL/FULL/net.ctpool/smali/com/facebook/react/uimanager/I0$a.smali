.class Lcom/facebook/react/uimanager/I0$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/I0;->e(I)Ljava/lang/ThreadLocal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/uimanager/I0$a;->a:I

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/I0$a;->a:I

    new-array v0, v0, [Ljava/lang/Object;

    return-object v0
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/I0$a;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
