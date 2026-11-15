.class public final synthetic Lio/invertase/firebase/analytics/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/invertase/firebase/analytics/v;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lio/invertase/firebase/analytics/v;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/firebase/analytics/u;->a:Lio/invertase/firebase/analytics/v;

    iput-wide p2, p0, Lio/invertase/firebase/analytics/u;->b:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/u;->a:Lio/invertase/firebase/analytics/v;

    iget-wide v1, p0, Lio/invertase/firebase/analytics/u;->b:J

    invoke-static {v0, v1, v2}, Lio/invertase/firebase/analytics/v;->g(Lio/invertase/firebase/analytics/v;J)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
