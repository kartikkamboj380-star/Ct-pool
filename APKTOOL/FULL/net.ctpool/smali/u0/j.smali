.class public final synthetic Lu0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/j;->m:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/j;->m:Landroid/content/Intent;

    invoke-static {v0}, Lapp/notifee/core/Notifee;->a(Landroid/content/Intent;)V

    return-void
.end method
