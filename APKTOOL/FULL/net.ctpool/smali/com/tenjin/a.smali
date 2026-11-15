.class public final synthetic Lcom/tenjin/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/AttributionInfoCallback;


# instance fields
.field public final synthetic a:Lcom/tenjin/TenjinModule;

.field public final synthetic b:Lcom/facebook/react/bridge/Callback;


# direct methods
.method public synthetic constructor <init>(Lcom/tenjin/TenjinModule;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/a;->a:Lcom/tenjin/TenjinModule;

    iput-object p2, p0, Lcom/tenjin/a;->b:Lcom/facebook/react/bridge/Callback;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/util/Map;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tenjin/a;->a:Lcom/tenjin/TenjinModule;

    iget-object v1, p0, Lcom/tenjin/a;->b:Lcom/facebook/react/bridge/Callback;

    invoke-static {v0, v1, p1}, Lcom/tenjin/TenjinModule;->a(Lcom/tenjin/TenjinModule;Lcom/facebook/react/bridge/Callback;Ljava/util/Map;)V

    return-void
.end method
