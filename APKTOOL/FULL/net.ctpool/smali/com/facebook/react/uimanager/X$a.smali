.class final Lcom/facebook/react/uimanager/X$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Lcom/facebook/react/uimanager/X$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/X$a;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/X$a;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/X$a;->m:Lcom/facebook/react/uimanager/X$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/yoga/c;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/yoga/d;->a()Lcom/facebook/yoga/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/yoga/c;->b(F)V

    sget-object v1, Lcom/facebook/yoga/k;->r:Lcom/facebook/yoga/k;

    invoke-virtual {v0, v1}, Lcom/facebook/yoga/c;->a(Lcom/facebook/yoga/k;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/X$a;->a()Lcom/facebook/yoga/c;

    move-result-object v0

    return-object v0
.end method
