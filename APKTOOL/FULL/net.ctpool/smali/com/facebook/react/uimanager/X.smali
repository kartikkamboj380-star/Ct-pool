.class public final Lcom/facebook/react/uimanager/X;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/X;

.field private static final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/uimanager/X;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/X;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/X;->a:Lcom/facebook/react/uimanager/X;

    sget-object v0, Li5/j;->o:Li5/j;

    sget-object v1, Lcom/facebook/react/uimanager/X$a;->m:Lcom/facebook/react/uimanager/X$a;

    invoke-static {v0, v1}, Li5/g;->a(Li5/j;Lv5/a;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/X;->b:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lcom/facebook/yoga/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/X;->a:Lcom/facebook/react/uimanager/X;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/X;->b()Lcom/facebook/yoga/c;

    move-result-object v0

    return-object v0
.end method

.method private final b()Lcom/facebook/yoga/c;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/X;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/yoga/c;

    return-object v0
.end method
