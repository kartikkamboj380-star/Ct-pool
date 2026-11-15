.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super LN/a;
.source "SourceFile"

# interfaces
.implements Lw3/n$a;


# instance fields
.field private c:Lw3/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LN/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, LN/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lw3/n;

    if-nez v0, :cond_0

    new-instance v0, Lw3/n;

    invoke-direct {v0, p0}, Lw3/n;-><init>(Lw3/n$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lw3/n;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lw3/n;

    invoke-virtual {v0, p1, p2}, Lw3/n;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
