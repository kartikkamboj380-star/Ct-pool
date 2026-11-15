.class public final Lcom/facebook/react/uimanager/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/L0;

.field private static final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/uimanager/L0;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/L0;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/L0;->a:Lcom/facebook/react/uimanager/L0;

    sget-object v0, Li5/j;->m:Li5/j;

    sget-object v1, Lcom/facebook/react/uimanager/L0$a;->m:Lcom/facebook/react/uimanager/L0$a;

    invoke-static {v0, v1}, Li5/g;->a(Li5/j;Lv5/a;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/L0;->b:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()LS1/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/L0;->a:Lcom/facebook/react/uimanager/L0;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/L0;->b()LS1/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final b()LS1/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/L0;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LS1/b;

    .line 8
    .line 9
    return-object v0
.end method
