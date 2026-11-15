.class final Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/defaults/DefaultReactHostDelegate;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/fabric/ReactNativeConfig;Lv5/l;Lcom/facebook/react/T$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;

    invoke-direct {v0}, Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;-><init>()V

    sput-object v0, Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;->m:Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lcom/facebook/react/defaults/DefaultReactHostDelegate$a;->a(Ljava/lang/Exception;)V

    sget-object p1, Li5/u;->a:Li5/u;

    return-object p1
.end method
