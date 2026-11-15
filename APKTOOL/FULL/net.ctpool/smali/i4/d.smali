.class public final synthetic Li4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/d;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/d;->a:Ljava/lang/Runnable;

    invoke-static {v0, p1}, Li4/e;->a(Ljava/lang/Runnable;Lz3/l;)Lz3/l;

    move-result-object p1

    return-object p1
.end method
