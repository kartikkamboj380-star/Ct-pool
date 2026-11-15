.class final synthetic Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;
.super Lw5/i;
.source "SourceFile"

# interfaces
.implements Lv5/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/th3rdwave/safeareacontext/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final v:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;

    invoke-direct {v0}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;-><init>()V

    sput-object v0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;->v:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V"

    const/4 v5, 0x1

    const/4 v1, 0x3

    const-class v2, Lcom/th3rdwave/safeareacontext/g;

    const-string v3, "handleOnInsetsChange"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lw5/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/th3rdwave/safeareacontext/f;

    check-cast p2, Lcom/th3rdwave/safeareacontext/a;

    check-cast p3, Lcom/th3rdwave/safeareacontext/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;->l(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method

.method public final l(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V
    .locals 1

    .line 1
    const-string v0, "p0"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p2"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcom/th3rdwave/safeareacontext/g;->a(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V

    return-void
.end method
