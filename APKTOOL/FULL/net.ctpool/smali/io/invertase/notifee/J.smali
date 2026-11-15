.class public final synthetic Lio/invertase/notifee/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/invertase/notifee/L$c;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/facebook/react/bridge/WritableMap;

.field public final synthetic c:J

.field public final synthetic d:Lio/invertase/notifee/L$c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/notifee/J;->a:Ljava/lang/String;

    iput-object p2, p0, Lio/invertase/notifee/J;->b:Lcom/facebook/react/bridge/WritableMap;

    iput-wide p3, p0, Lio/invertase/notifee/J;->c:J

    iput-object p5, p0, Lio/invertase/notifee/J;->d:Lio/invertase/notifee/L$c;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/invertase/notifee/J;->a:Ljava/lang/String;

    iget-object v1, p0, Lio/invertase/notifee/J;->b:Lcom/facebook/react/bridge/WritableMap;

    iget-wide v2, p0, Lio/invertase/notifee/J;->c:J

    iget-object v4, p0, Lio/invertase/notifee/J;->d:Lio/invertase/notifee/L$c;

    invoke-static {v0, v1, v2, v3, v4}, Lio/invertase/notifee/L;->a(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JLio/invertase/notifee/L$c;)V

    return-void
.end method
