.class public final synthetic Lv0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lv0/i;

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv0/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/g;->m:Lv0/i;

    iput-object p2, p0, Lv0/g;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/g;->m:Lv0/i;

    iget-object v1, p0, Lv0/g;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lv0/i;->a(Lv0/i;Ljava/lang/String;)V

    return-void
.end method
