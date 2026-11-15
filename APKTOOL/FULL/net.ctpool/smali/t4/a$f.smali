.class public final Lt4/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt4/a$f$a;
    }
.end annotation


# instance fields
.field final a:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/a$f;->a:Landroid/os/Bundle;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Bundle;Lt4/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lt4/a$f;-><init>(Landroid/os/Bundle;)V

    return-void
.end method
