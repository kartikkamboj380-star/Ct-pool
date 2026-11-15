.class public final Lcom/facebook/react/uimanager/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/x$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/react/uimanager/x$a;


# instance fields
.field private final a:F

.field private final b:Lcom/facebook/react/uimanager/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/uimanager/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/uimanager/x;->c:Lcom/facebook/react/uimanager/x$a;

    return-void
.end method

.method public constructor <init>(FLcom/facebook/react/uimanager/y;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/uimanager/x;->a:F

    iput-object p2, p0, Lcom/facebook/react/uimanager/x;->b:Lcom/facebook/react/uimanager/y;

    return-void
.end method

.method public static final c(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/uimanager/x;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/x;->c:Lcom/facebook/react/uimanager/x$a;

    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/x$a;->a(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/uimanager/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/facebook/react/uimanager/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/x;->b:Lcom/facebook/react/uimanager/y;

    return-object v0
.end method

.method public final b(FF)F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/x;->b:Lcom/facebook/react/uimanager/y;

    sget-object v1, Lcom/facebook/react/uimanager/y;->n:Lcom/facebook/react/uimanager/y;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/facebook/react/uimanager/x;->a:F

    const/16 v1, 0x64

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    mul-float/2addr v0, p1

    return v0

    :cond_0
    iget p1, p0, Lcom/facebook/react/uimanager/x;->a:F

    return p1
.end method
