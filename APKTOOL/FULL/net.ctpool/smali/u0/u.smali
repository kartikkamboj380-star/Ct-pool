.class public final synthetic Lu0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/f;


# instance fields
.field public final synthetic a:Lapp/notifee/core/interfaces/MethodCallResult;


# direct methods
.method public synthetic constructor <init>(Lapp/notifee/core/interfaces/MethodCallResult;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/u;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/u;->a:Lapp/notifee/core/interfaces/MethodCallResult;

    invoke-static {v0, p1}, Lapp/notifee/core/Notifee;->e(Lapp/notifee/core/interfaces/MethodCallResult;Lz3/l;)V

    return-void
.end method
