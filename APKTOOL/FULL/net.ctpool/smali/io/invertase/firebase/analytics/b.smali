.class public final synthetic Lio/invertase/firebase/analytics/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/f;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/firebase/analytics/b;->a:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/b;->a:Lcom/facebook/react/bridge/Promise;

    invoke-static {v0, p1}, Lio/invertase/firebase/analytics/ReactNativeFirebaseAnalyticsModule;->c(Lcom/facebook/react/bridge/Promise;Lz3/l;)V

    return-void
.end method
