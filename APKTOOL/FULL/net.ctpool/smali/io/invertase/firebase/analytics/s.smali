.class public final synthetic Lio/invertase/firebase/analytics/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/invertase/firebase/analytics/v;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/invertase/firebase/analytics/s;->a:Lio/invertase/firebase/analytics/v;

    iput-object p2, p0, Lio/invertase/firebase/analytics/s;->b:Ljava/lang/String;

    iput-object p3, p0, Lio/invertase/firebase/analytics/s;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/analytics/s;->a:Lio/invertase/firebase/analytics/v;

    iget-object v1, p0, Lio/invertase/firebase/analytics/s;->b:Ljava/lang/String;

    iget-object v2, p0, Lio/invertase/firebase/analytics/s;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lio/invertase/firebase/analytics/v;->e(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
